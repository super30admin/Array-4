// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach

//from index 1 to end keep comparing "previous Sum along with current value" and "current value". whichever is bigger add that in currSum(or previous Sum)
// for getting maxSum compare previous maxSum n currSum.  whichever is bigger add that in MaxSum

class Solution {
    public int maxSubArray(int[] nums) {
        
      //  int n = nums.length();
        int currSum = nums[0];
        int maxSum = nums[0];
        
        for(int i =1; i< nums.length; i ++)
        {
            currSum =   Math.max(nums[i],currSum + nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}