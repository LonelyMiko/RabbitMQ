package arraySecondTier;

public class more14 {
    public boolean more14(int[] nums) {
        int firstCount = 0;
        int fourthCount = 0;
        for (int num : nums)
        {
            if (num == 1)
            {
                firstCount++;
            }
            if (num == 4)
            {
                fourthCount++;
            }
        }

        return firstCount > fourthCount;
    }

}
