package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;

public final class CountingSort {

    public static void sort(Movie[] movie) {
        if (movie != null) {
            int maxValue = findMaxValue(movie);
            countingSort(movie, maxValue);
        } else {
            throw new IllegalArgumentException("Input paramenter for array to sort is null.");
        }
    }

    private static void countingSort(Movie[] collection, int maxValue) {
        int[] countArray = countOccurrences(collection, maxValue);
        reconstructArray(collection, countArray, maxValue);
    }

    private static int findMaxValue(Movie[] collection) {
        int highest = (int) collection[0].getId();
        for (int index = 1; index < collection.length; index ++) {
            if (collection[index].getId() > highest) {
                highest = (int) collection[index].getId();
            }
        }
        return highest;
    }

    private static int[] countOccurrences(Movie[] collection, int maxValue) {
        int[] tempArray = new int[maxValue + 1];
        for (Movie movie : collection) {
            int key = (int) movie.getId();
            tempArray[key]++;
        }
        return tempArray;
    }

    private static void reconstructArray(Movie[] collection, int[] countArray, int maxValue) {
        int j = 0;
        for (int i = 0; i <= maxValue; i++) {
            while (countArray[i] > 0) {
                collection[j++].setId(i);
                countArray[i]--;
            }
        }
    }
}
