/**
 * LeetCode Execution: Smooth
 * 
 * Approach: DP Approach, at nay point get the maxSubarry sum that is possible
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 */


class Solution {
    public int maxSubArray(int[] nums) {
        
        long maxTracker = nums[0], currSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (currSum + nums[i] > nums[i]) currSum = currSum + nums[i];
            else currSum = nums[i];
            
            if (maxTracker < currSum) maxTracker = currSum;
        }
        
        return (int)maxTracker;
        
    }
}

