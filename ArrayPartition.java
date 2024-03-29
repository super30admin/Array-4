// TC: O(n + nlogn)
// SC: O(1)

// Approach: Greedy approach works here. The only way to get the max result is
// to get every second max element in the array.
import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            res += nums[i];
        }

        return res;
    }
}