package arraySecondTier;

public class has12 {
    public boolean has12(int[] nums) {
    boolean has12 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
            {
                while (i < nums.length)
                {
                  if (nums[i] == 2)
                  {
                      has12 = true;
                  }
                  i++;
                }
            }
        }
        return has12;
    }
}
