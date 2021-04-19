package arraySecondTier;

public class fizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int index = 0;
        int[] destination = new int[end-start];
        for (int i = start; i < end; i++) {
            destination[index] = i;
            index++;
        }
        return destination;
    }
}
