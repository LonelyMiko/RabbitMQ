package arraySecondTier;

import java.util.ArrayList;

public class pre4 {
    public int[] pre4(int[] nums) {
        int index = 0;
        while (nums[index] != 4 )
        {
            index++;
        }
        int[] arr = new int[index];

        System.arraycopy(nums, 0, arr, 0, index);
        return arr;
    }

}
