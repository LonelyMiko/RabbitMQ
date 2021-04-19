package arraySecondTier;

public class modThree {
    public boolean modThree(int[] nums) {
        boolean isEvenOrOdd = false;
        for (int i = 0; i < nums.length-2; i++) {
            if (isEven(nums[i]) && isEven(nums[i+1]) && isEven(nums[i+2]))
            {
                isEvenOrOdd = true;
            }
            if (isOdd(nums[i]) && isOdd(nums[i+1]) && isOdd(nums[i+2]))
            {
                isEvenOrOdd = true;
            }
        }
        return isEvenOrOdd;
    }
    private boolean isEven(int value)
    {
        return (value % 2 == 0);
    }

    private boolean isOdd(int value)
    {
        return (value % 2 != 0);
    }
}
