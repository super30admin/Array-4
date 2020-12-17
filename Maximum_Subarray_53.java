//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
         int runningSum = nums[0];
         int max = nums[0];
         for(int i = 1; i < nums.length; i++)
         {
             runningSum = Math.max(nums[i], runningSum + nums[i]);
             max = Math.max(max, runningSum);
         }
         return max;
     }
	public static void main(String[] args)
	{
		Maximum_Subarray_53 hInd = new Maximum_Subarray_53();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(hInd.maxSubArray(nums));
	}
}
