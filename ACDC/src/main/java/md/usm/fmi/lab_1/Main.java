package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> listCountry;

        listCountry = ReadJSON.read();

        int i=listCountry.size();

        //array ordonat
        Movie[] movies = new Movie[i+1];
        Iterator<Movie> iterator_1 = listCountry.iterator();
        for(i=0;i<movies.length & iterator_1.hasNext();i++){
            movies[i]=iterator_1.next();
        }


        Collections.shuffle(listCountry);

        //array amestecat
        Movie[] moviesShuffle = new Movie[i];
        Iterator<Movie> iterator_2 = listCountry.iterator();
        for(i=0;i<moviesShuffle.length & iterator_2.hasNext();i++){
            moviesShuffle[i]=iterator_2.next();
        }

        System.out.println("Linear Search: ");
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.linearSearch(movies,13);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Binary Search: ");
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(movies,13);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Tree Search: ");
        treeSearch tree = new treeSearch();
        Node root = null;
        for (Movie key: movies) {
            root = tree.insert(root, key);
        }
        System.out.println(tree.find(root,13).data.toString());

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Interpol Search: ");
        interpolationSearch interpol = new interpolationSearch();
        System.out.println(interpol.interpolationSearch(movies,13).toString());

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Fibonacci Search: ");
        Fibonacci fibonacci = new Fibonacci();
        int index = fibonacci.fibonacciSearch(movies,13);
        System.out.println(movies[index].toString());
    }
}
