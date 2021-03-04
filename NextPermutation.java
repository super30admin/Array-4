/**

Leetcode: https://leetcode.com/problems/next-permutation/

Input: nums = [1,2,3]
Output: [1,3,2]

Time Complexity : O(1)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No 

**/
class Solution 
{
    public void nextPermutation(int[] nums) 
    {

    	if( nums == null || nums.length == 0)
    		return;

    	int index = nums.length -2;

    	while(index  >=0) {

    		if( nums[index] < nums[index+1])
    			break;
    		else
    			index--;
    	}

    	if( index == -1)
    	{
    		reverse(nums, 0, nums.length -1);
    		return;
    	}

    	// now find the index of num just greater than nums[k]
    	int index2 = nums.length -1;

    	while( index < index2){

    		if( nums[index2] > nums[index]){
    			break;
    		}
    		else
    		{
    			index2--;
    		}
    	}

    	int temp = nums[index];
    	nums[index] = nums[index2];
    	nums[index2] = temp;

    	reverse( nums, index + 1, nums.length -1);
        
    }

    private void reverse(int nums[], int start, int end) {
    	while(start < end){
    		int temp = nums[start];
    		nums[start] = nums[end];
    		nums[end] = temp;

    		start++; end--;
    	}
    }
}