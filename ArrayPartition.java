import java.util.Arrays;

// Time Complexity: O(nlogn)
// Space Complexity: O(1)

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}