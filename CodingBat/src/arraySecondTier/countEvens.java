package arraySecondTier;

public class countEvens {
    public int countEvens(int[] nums) {
    int evensCount = 0;
    for (int num : nums)
    {
        if (num%2 == 0)
        {
            evensCount++;
        }
    }
    return evensCount;
    }

}
