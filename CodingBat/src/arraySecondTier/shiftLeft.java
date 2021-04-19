package arraySecondTier;

public class shiftLeft {
    public int[] shiftLeft(int[] nums) {
        int shifted[] = new int[nums.length];
        if (shifted.length > 0) {
        shifted[shifted.length-1] = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                shifted[i] = nums[i + 1];
            }
        }
            return shifted;
    }
}
