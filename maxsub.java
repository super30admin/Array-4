// Time Complexity : 0(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int rsum = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            rsum = Math.max(rsum + nums[i], nums[i]); // if greater than take as standalone else combine
            max = Math.max(max, rsum);
        }

        return max;
    }
}