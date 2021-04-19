package md.usm.fmi.assets.lab_2;

import md.usm.fmi.assets.Movie;
import md.usm.fmi.assets.PrintArray;
import md.usm.fmi.lab_2.*;

import java.util.Scanner;

public class Menu {
    public static void init()
    {
        Movie[] movies;
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Choose a sorting method");
        System.out.println("1.Metoda bulelor (bublesort)");
        System.out.println("2.Metoda de insreție (insertionsort)");
        System.out.println("3.Metoda de selecție (selectionsort)");
        System.out.println("4.Metoda rapidă de sortare (quicksort)");
        System.out.println("5.Metoda Shell");
        System.out.println("6.Counting Sort");
        System.out.println("7.Metoda piramidală de sortare (heapsort)");
        System.out.println("8.Metoda de sortare prin interclasare (mergesort)");
        System.out.print("Choice: ");
        choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("---------------------------- Bubble Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                BubbleSort.sort(movies);
                PrintArray.printArray(movies);
                break;

            case 2:
                System.out.println("---------------------------- Insertion Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                InsertionSort.sort(movies);
                PrintArray.printArray(movies);
                break;

            case 3:
                System.out.println("---------------------------- Selection Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                SelectionSort.sort(movies);
                PrintArray.printArray(movies);
                break;

            case 4:
                System.out.println("---------------------------- Quick Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                QuickSort.sort(movies,0,movies.length-1);
                PrintArray.printArray(movies);
                break;

            case 5:
                System.out.println("---------------------------- Shell Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                ShellSort.sort(movies);
                PrintArray.printArray(movies);
                break;

            case 6:
                System.out.println("---------------------------- Counting Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                CountingSort.sort(movies);
                PrintArray.printArray(movies);
                break;

            case 7:
                System.out.println("---------------------------- Heap Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                HeapSort.sort(movies);
                PrintArray.printArray(movies);

            case 8:
                System.out.println("---------------------------- Merge Sort ----------------------------");
                movies = ReadJSON.read().toArray(new Movie[0]);
                MergeSort.sort(movies,0,movies.length-1);
                PrintArray.printArray(movies);
                break;

            default:
                System.out.println("Wrong choice!");
        }
        scanner.close();

    }
}
