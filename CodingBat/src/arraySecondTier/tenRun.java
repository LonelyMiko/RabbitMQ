package arraySecondTier;

public class tenRun {
    public int[] tenRun(int[] nums) {
        boolean ten = false;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                temp = nums[i];
                ten = true;
            }
            else if (nums[i] % 10 != 0 && ten) {
                nums[i] = temp;
            }
        }
        return nums;
    }

}
