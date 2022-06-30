/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        if(nums == null || nums.length ==0)
            return 0;
        
        
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for(int i =1; i < nums.length; i++)
        {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
        
    }
}