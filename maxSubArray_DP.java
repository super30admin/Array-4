// Time Complexity : O(n) where n is the length of the array nums
// Space Complexity : O(n) where n is the length of the array nums. Space can be reduced to O(1) since we are
// only using one previous element from the dp array, hence array isn't needed
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class maxSubArray_DP {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}