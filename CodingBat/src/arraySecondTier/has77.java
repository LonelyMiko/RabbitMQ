package arraySecondTier;

public class has77 {
    public boolean has77(int[] nums) {
        boolean has77 = false;
        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i] == 7 && nums[i+1] == 7) || (nums[i]==7 && nums[i+2] == 7) )
            {
                has77 = true;
            }
        }
        return has77;
    }
}
