// Time Complexity :o(N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxSubArray(int[] nums) {
       
        if(nums==null||nums.length==0)
            return 0;
        
        int currSum=nums[0];
        int maxSum=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            currSum+=nums[i];
            
            if(currSum<nums[i])
                currSum=nums[i];
            
            if(maxSum<currSum)
                maxSum=currSum;
        }
        
        return maxSum;
    }
}