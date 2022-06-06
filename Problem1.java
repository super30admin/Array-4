import java.util.Arrays;

public class Problem1 {
    // TC : O(nlogn)
    // SC : O(1)
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);
        int total = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            total += nums[i];
        }
        return total;
    }
}
