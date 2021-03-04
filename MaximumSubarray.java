/**
Given an integer array nums, find the contiguous subarray (containing at least one number) 
which has the largest sum and return its sum.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
**/
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int left = 0 ;
        int right;
        
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for( right = 0 ; right < nums.length ; right++)
        {
            currentSum = Math.max(currentSum + nums[right], nums[right]);
            
            maxSum = Math.max( currentSum, maxSum);
        }
        
        return maxSum;
        
    }
}