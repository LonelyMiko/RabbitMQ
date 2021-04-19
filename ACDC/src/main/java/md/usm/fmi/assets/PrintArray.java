package md.usm.fmi.assets;

public class PrintArray {
    public static void printArray(Movie[] arr)
    {
        for (Movie value : arr) {
            System.out.println(value.toString());
        }
    }
}
