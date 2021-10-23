package exercise;

import org.apache.spark.api.java.JavaPairRDD;

import java.util.Collections;

public class Util {
    /**
     * Swap elements in JavaPairRDD
     * @param data initial list
     * @return swapped <code>data</code>
     * @see Collections#singletonList(Object)
     */
    public static JavaPairRDD<Integer, Integer> swapData(JavaPairRDD<Integer, Integer> data)
    {
        return data.flatMapToPair(x -> Collections.singletonList(x.swap()).iterator());
    }

    /**
     * Get score based on percent
     * @param percent course precent of views
     * @return score
     */
    public static int getScore(Double percent)
    {
        if (percent > 0.9)
        {
            return 10;
        }
        if (percent > 0.5 && percent < 0.9){
            return 4;
        }
        if (percent > 0.25 && percent < 0.5){
            return 2;
        }
        return 0;
    }
}
