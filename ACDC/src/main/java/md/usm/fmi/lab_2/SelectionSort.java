package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;

public class SelectionSort {
    public static void sort(Movie[] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getId() < arr[min_idx].getId())
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Movie temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
