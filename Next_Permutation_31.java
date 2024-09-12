//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None
package com.s30.satish;

class Next_Permutation_31 {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int i = n-2;
        int j = n-1;
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        if(i >= 0)
        {
            while(nums[i] >= nums[j])
                j--;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        int l = i+1;
        int r = n-1;
        while(l < r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }  
    }
	public static void main(String[] args)
	{
		Next_Permutation_31 NP = new Next_Permutation_31();
		int[] nums = {1,2,3};
		
		NP.nextPermutation(nums);
	}
}
