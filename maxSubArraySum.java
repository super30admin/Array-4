// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * At every num, we keep track of localMAX and globalMAX, so in this process we know the max possible subarray sum
 */

class Solution {
    public int maxSubArray(int[] nums) {
        // kadane's algorithm
        int localMax = nums[0], globalMax = localMax;
        for(int i = 1; i < nums.length; i++){
            localMax = Math.max(localMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}