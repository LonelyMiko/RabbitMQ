package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    public static void sort(Movie[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Movie key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j].getId() > key.getId()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
