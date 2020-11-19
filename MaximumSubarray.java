// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// to find contiguous subarray with max sum, maintain dp array with dp[i] = Math.max(dp[i-1]+nums[i], nums[i]), continue from last element 
// or start from this  

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
              
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        
        return max;
    }
}