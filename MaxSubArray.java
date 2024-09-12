
/*
====================== Approach-1 ======================
Time: O(N)
Space: O(N)
Approach:
========
1. Calculate maxsum so far and store at every index in dp array
2. Update max as we iterate through the array
*/
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0; 
        // matrix of length n to keep track of max so far
        int[] dp = new int[nums.length]; 
        dp[0] = nums[0]; 
        int max = dp[0]; 
        
        // Update dp[i] and max for every index
        for(int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0); 
            max = Math.max(max, dp[i]); 
        }
        return max;
    }
}

/*
===================== Approach-2 ========================
Time: O(N)
Space: O(1)
Algorithm:
=========
1. Instead of dp array, use two indices to memoize maximum sum so far, as we no longer require previous sums
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for(int i = 1; i < nums.length; i++) {
            // if maxEndingHere is less than 
            maxEndingHere= Math.max(maxEndingHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}