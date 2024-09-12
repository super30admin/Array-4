//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;
import java.util.Arrays;

class Array_Partition_1_561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i=i+2)
            sum += Math.min(nums[i], nums[i+1]);
        return sum;
    }
	public static void main(String[] args)
	{
		Array_Partition_1_561 AP = new Array_Partition_1_561();
		int[] nums = {6,2,6,5,1,2};
		
		System.out.println(AP.arrayPairSum(nums));
	}
}
