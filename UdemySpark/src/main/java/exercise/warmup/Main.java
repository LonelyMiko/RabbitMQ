package exercise.warmup;

import exercise.Util;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.List;

/*
Build an RDD containing a key of courseId together with the number of chapters on that course
 */
public class Main {
    public static void main(String[] args) {
        Logger.getLogger("org.apache").setLevel(Level.WARN);

        SparkConf conf = new SparkConf().setAppName("warmup").setMaster("local[*]");
        try(var sparkContext = new JavaSparkContext(conf)){
            boolean testMode = true;

            JavaPairRDD<Integer, Integer> viewData = setUpViewDataRdd(sparkContext, testMode);
            JavaPairRDD<Integer, Integer> chapterData = setUpChapterDataRdd(sparkContext, testMode);
            JavaPairRDD<Integer, String> titlesData = setUpTitlesDataRdd(sparkContext, testMode);

            /* Exercise 1: as a warm up, build an RDD containing a key of courseId together
            with the number of chapters on that course. */
            JavaPairRDD<Integer,Integer> swappedChapterData = chapterData.mapToPair(value -> new Tuple2<>(value._2,1));
            JavaPairRDD<Integer, Integer> countChapter = swappedChapterData.reduceByKey(Integer::sum);
            System.out.println("Exercise 1: ");
            countChapter.collect().forEach(System.out::println);

            /* Exercise 2: Your job is to produce a ranking chart detailing which are the
            most popular courses by score. */
            System.out.println("\nExercise 2: ");
            //Step 1: Removing Duplicate Views
            //distinct() - remove any duplicated
            JavaPairRDD<Integer, Integer> viewDataWithoutDuplicate = viewData.distinct();
            JavaPairRDD<Integer, Integer> swappedViewDataWithoutDuplicate = Util.swapData(viewDataWithoutDuplicate);

            //Step 2: Joining to get Course Id in the RDD
            //Integer -> chapterId, Tuple2 -> userId, courseId
            JavaPairRDD<Integer, Tuple2<Integer, Integer>> viewDataWithCourseId = swappedViewDataWithoutDuplicate.join(chapterData);


            // Step 3 - don't need chapterIsd, setting up for a reduce
            //Tuple2 -> userId, courseId, Long -> views count
            JavaPairRDD<Tuple2<Integer,Integer>,Long> step3 = viewDataWithCourseId.mapToPair(value -> {
                Integer userId = value._2._1;
                Integer courseId = value._2._2;
                return new Tuple2<>(new Tuple2<>(userId,courseId),1L);
            });


            //Step 4 - Count Views for User/Course
            //Tupl2 -> userId, courseId, Long -> total views
            JavaPairRDD<Tuple2<Integer, Integer>, Long> step4 = step3.reduceByKey(Long::sum);

            //Step 5 - Drop the userId
            //Tuple2 -> courseId, views
            JavaPairRDD<Integer,Long> viewDataWithoutChapterId = step4.mapToPair(value -> {
               Integer courseId = value._1._2;
               Long views = value._2;
               return new Tuple2<>(courseId,views);
            });

            //Step 6: of how many chapters?
            //Integer -> courseId, Tuple2 -> views, chapterCount
            JavaPairRDD<Integer, Tuple2<Long, Integer>> step6 = viewDataWithoutChapterId.join(countChapter);

            //Step 7: Convert to percentages
            JavaPairRDD<Integer, Double> step7 = step6.mapValues(value -> (double) value._1 / value._2);

            //Step 8: Convert to scores
            JavaPairRDD<Integer, Integer> step8 = step7.mapToPair(value -> {
                Integer courseId = value._1;
                Integer score = Util.getScore(value._2);
                return new Tuple2<>(courseId, score);
            });

            //Step 9: Add up the total scores
            //Integer -> courseId, Integer -> total score
            JavaPairRDD<Integer, Integer> step9 = step8.reduceByKey(Integer::sum);
            step9.collect().forEach(System.out::println);

            // step 10
            //Integer -> courseId, Tuple2 -> score, title
            JavaPairRDD<Integer, Tuple2<Integer, String>> step10 = step9.join(titlesData);


            //step 11
            //Integer -> score, String -> title
            JavaPairRDD<Integer, String> step11 = step10.mapToPair(row -> new Tuple2<>(row._2._1, row._2._2));
            step11.sortByKey(false).collect().forEach(System.out::println);

        }
    }
    private static JavaPairRDD<Integer, String> setUpTitlesDataRdd(JavaSparkContext sc, boolean testMode) {

        if (testMode)
        {
            // (chapterId, title)
            List<Tuple2<Integer, String>> rawTitles = new ArrayList<>();
            rawTitles.add(new Tuple2<>(1, "How to find a better job"));
            rawTitles.add(new Tuple2<>(2, "Work faster harder smarter until you drop"));
            rawTitles.add(new Tuple2<>(3, "Content Creation is a Mug's Game"));
            return sc.parallelizePairs(rawTitles);
        }
        return sc.textFile("src/main/resources/viewing figures/titles.csv")
                .mapToPair(commaSeparatedLine -> {
                    String[] cols = commaSeparatedLine.split(",");
                    return new Tuple2<>(Integer.valueOf(cols[0]),cols[1]);
                });
    }

    private static JavaPairRDD<Integer, Integer> setUpChapterDataRdd(JavaSparkContext sc, boolean testMode) {

        if (testMode)
        {
            // (chapterId, (courseId, courseTitle))
            List<Tuple2<Integer, Integer>> rawChapterData = new ArrayList<>();
            rawChapterData.add(new Tuple2<>(96,  1));
            rawChapterData.add(new Tuple2<>(97,  1));
            rawChapterData.add(new Tuple2<>(98,  1));
            rawChapterData.add(new Tuple2<>(99,  2));
            rawChapterData.add(new Tuple2<>(100, 3));
            rawChapterData.add(new Tuple2<>(101, 3));
            rawChapterData.add(new Tuple2<>(102, 3));
            rawChapterData.add(new Tuple2<>(103, 3));
            rawChapterData.add(new Tuple2<>(104, 3));
            rawChapterData.add(new Tuple2<>(105, 3));
            rawChapterData.add(new Tuple2<>(106, 3));
            rawChapterData.add(new Tuple2<>(107, 3));
            rawChapterData.add(new Tuple2<>(108, 3));
            rawChapterData.add(new Tuple2<>(109, 3));
            return sc.parallelizePairs(rawChapterData);
        }

        return sc.textFile("src/main/resources/viewing figures/chapters.csv")
                .mapToPair(commaSeparatedLine -> {
                    String[] cols = commaSeparatedLine.split(",");
                    return new Tuple2<>(Integer.valueOf(cols[0]), Integer.valueOf(cols[1]));
                });
    }

    private static JavaPairRDD<Integer, Integer> setUpViewDataRdd(JavaSparkContext sc, boolean testMode) {

        if (testMode)
        {
            // Chapter views - (userId, chapterId)
            List<Tuple2<Integer, Integer>> rawViewData = new ArrayList<>();
            rawViewData.add(new Tuple2<>(14, 96));
            rawViewData.add(new Tuple2<>(14, 97));
            rawViewData.add(new Tuple2<>(13, 96));
            rawViewData.add(new Tuple2<>(13, 96));
            rawViewData.add(new Tuple2<>(13, 96));
            rawViewData.add(new Tuple2<>(14, 99));
            rawViewData.add(new Tuple2<>(13, 100));
            return  sc.parallelizePairs(rawViewData);
        }

        return sc.textFile("src/main/resources/viewing figures/views-*.csv")
                .mapToPair(commaSeparatedLine -> {
                    String[] columns = commaSeparatedLine.split(",");
                    return new Tuple2<>(Integer.valueOf(columns[0]), Integer.valueOf(columns[1]));
                });
    }
}
