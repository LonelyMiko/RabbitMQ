package arraySecondTier;

public class only14 {
    public boolean only14(int[] nums) {
        for (int num : nums)
        {
            if (num != 1 && num!=4)
            {
                return false;
            }
        }
        return true;
    }
}
