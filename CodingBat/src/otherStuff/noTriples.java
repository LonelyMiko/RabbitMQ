package otherStuff;

public class noTriples {
    public static void main(String[] args) {
    int nums[] = {1, 2, 7, 1};
    for (int i=0; i < (nums.length-2); i++)
        {
        int val = nums[i];
        if (nums[i+1] == (val+5) && Math.abs(nums[i+2] - (val-1)) <= 2)
            {
                System.out.println("TRUE");
            }
        }
    }
}
