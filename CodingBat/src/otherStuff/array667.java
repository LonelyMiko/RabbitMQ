package otherStuff;

import java.util.Arrays;

public class array667 {
    public static void main(String[] args) {
        int nums[] = {6, 6, 2, 6};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length)
            {
                if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}
