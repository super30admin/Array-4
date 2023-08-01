// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int max = Integer.MIN_VALUE;
        int rSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            max = Integer.max(max, rSum);
            if (rSum < 0) {
                rSum = 0;
            }
        }
        return max;
    }
}