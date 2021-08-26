// Time Complexity : O(n), n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int currSum = nums[0];
        int maxSum = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            currSum = Math.max(currSum+nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}