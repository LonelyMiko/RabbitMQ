package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;

public class BubbleSort {
    public static void sort(Movie[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getId() > arr[j+1].getId())
                {
                    // swap arr[j+1] and arr[j]
                    Movie temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
