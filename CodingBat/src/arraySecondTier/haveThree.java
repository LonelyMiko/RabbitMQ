package arraySecondTier;

public class haveThree {
    public boolean haveThree(int[] nums) {
        byte count3 = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 3 && nums[i+1] != 3)
            {
                count3++;
            }
        }
        if (nums.length > 3) {
            if (nums[nums.length - 1] == 3 && nums[nums.length - 2] != 3) {
                count3++;
            }
        }
        return (count3 == 3);
    }
}
