// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach

// We sort the array(because we take minimum and sum should be max, we see the loss is less by sorting)
// We iterate and take the n-2 from the last and add it to the sum
// we return sum as result

class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n - 2; i >= 0; i = i - 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}