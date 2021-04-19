package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

public class LinearSearch {
    public void linearSearch(Movie[] movies, int id)
    {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id)
            {
                System.out.println("We found an element under the index: " + id + " in " + (i+1) + " steps");
                System.out.println(movies[i].toString());
                break;
            }
        }
    }
}
