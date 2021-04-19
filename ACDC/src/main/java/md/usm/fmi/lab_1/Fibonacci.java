package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

public class Fibonacci {
    public int fibonacciSearch(Movie[] arr, int id)
    {
        int fibMM2 = 0;
        int fibMM1 = 1;
        int fibM = fibMM1 + fibMM2;
        while (fibM < arr.length)
        {
            fibMM2 = fibMM1;
            fibMM1 = fibM;
            fibM = fibMM2 + fibMM1;
        }
        int offset = -1;
        while (fibM > 1)
        {
            int index = Math.min(offset + fibMM2, arr.length -1);
            if (arr[index].getId() < id)
            {
                fibM = fibMM1;
                fibMM1 = fibMM2;
                fibMM2 = fibM - fibMM1;
                offset = index;
            }
            else if (arr[index].getId() > id) {
                fibM = fibMM2;
                fibMM1 = fibMM1 - fibMM2;
                fibMM2 = fibM - fibMM1;
            }
            else
                {
                    return index;
                }
            if (fibMM1 == 1 && arr[arr.length - 1].getId() == id)
            {
                return arr.length-1;
            }
        }
        return -1;
    }
}
