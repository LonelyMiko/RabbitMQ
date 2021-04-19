package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;

public class MergeSort {
    private  static void merge(Movie[] movies, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = (int) movies[l + i].getId();
        for (int j = 0; j < n2; ++j)
            R[j] = (int) movies[m + 1 + j].getId();

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                movies[k].setId(L[i]);
                i++;
            }
            else {
                movies[k].setId(R[j]);
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            movies[k].setId(L[i]);
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            movies[k].setId(R[j]);
            j++;
            k++;
        }
    }

    // Main function that sorts arr[start..end] using
    // merge()
    public static void sort(Movie[] movies, int start, int end)
    {
        if (start < end) {
            // Find the middle point
            int m =start+ (end-start)/2;

            // Sort first and second halves
            sort(movies, start, m);
            sort(movies, m + 1, end);

            // Merge the sorted halves
            merge(movies, start, m, end);
        }
    }

}
