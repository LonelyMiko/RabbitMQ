package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

public class interpolationSearch {
    public Movie interpolationSearch(Movie[] movies, int id) {

        int mid;
        int low = 0;
        int high = movies.length - 2;

        while (movies[low].getId() < id && movies[high].getId() > id) {
            if (movies[high].getId() == movies[low].getId())
                break;
            mid =(int)( low + ((id - movies[low].getId()) * (high - low)) / (movies[high].getId() - movies[low].getId()));

            if (movies[mid].getId() < id)
                low = mid + 1;
            else if (movies[mid].getId() > id)
                high = mid - 1;
            else
                return movies[mid];
        }

        if (movies[low].getId() == id)
            return movies[low];
        if (movies[high].getId() == id)
            return movies[high];

        return movies[0];
    }
}
