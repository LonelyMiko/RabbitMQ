package md.usm.fmi.lab_2;

import md.usm.fmi.assets.Movie;

public class HeapSort {
    public static void sort(Movie[] movies)
    {
        int n = movies.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(movies, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Movie temp = movies[0];
            movies[0] = movies[i];
            movies[i] = temp;

            // call max heapify on the reduced heap
            heapify(movies, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(Movie[] movies, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && movies[l].getId() > movies[largest].getId())
            largest = l;

        // If right child is larger than largest so far
        if (r < n && movies[r].getId() > movies[largest].getId())
            largest = r;

        // If largest is not root
        if (largest != i) {
            Movie swap = movies[i];
            movies[i] = movies[largest];
            movies[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(movies, n, largest);
        }
    }
}
