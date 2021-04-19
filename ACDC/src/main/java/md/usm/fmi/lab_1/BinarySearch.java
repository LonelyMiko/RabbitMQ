package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

public class BinarySearch {
    public void binarySearch(Movie[] arr, int id)
    {
        int count = 0;
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) / 2;
        while (start <= end)
        {
            count++;
            mid = (start + end) / 2;
            if (arr[mid].getId() == id)
            {
                System.out.println("We found an element under the index: " + id + " for " + count + " steps");
                System.out.println(arr[mid].toString());
                break;
            }
            if (arr[mid].getId() < id){
                start = mid + 1;
            }
            else if (arr[mid].getId() > id)
            {
                end = mid - 1;
            }
        }
    }
}
