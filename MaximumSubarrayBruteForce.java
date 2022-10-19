// Time complexity: O(n)
// Space complexity: O(n)

// Approach: DP. space can be optimized by using 2 variables

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length+1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            dp[i+1] = Math.max(dp[i] + nums[i], nums[i]);
            max = Math.max(max, dp[i+1]);
        }
        return max;
    }
}