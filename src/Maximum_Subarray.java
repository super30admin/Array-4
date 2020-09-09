//Time Complexity : O(n), size of the array
//Space Complexity :O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**By having the running sum and check if running sum is greater than current value or not
 * Return the maximum running sum.
 * **/
class Maximum_Subarray {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		int runningSum = nums[0];
		int max = nums[0];
		for(int i=1; i<nums.length; i++){   // start from 2nd value
			runningSum = Math.max(nums[i], runningSum + nums[i]);   // find running sum maximum as the sum till the point or if we consider the value alone and start from there
			max = Math.max(max, runningSum);    // update max based on running sum value
		}
		return max;
	}
}

/**********Follow up to get the values********************/
class Solution {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		int start = 0, end =0;
		int rSum = 0;
		int k = 0;	
		int max = Integer.MIN_VALUE;

		for(int i=0; i<nums.length; i++){
			rSum = rSum + nums[i];	// set rSum to previous sum and current value
			if(nums[i] > rSum){	// if the num alone is better than considering the previous sum with curr
				rSum = nums[i];	// set rSum as current value
				k = i;	// reset k to i as rSum will start from here
			}
			if(rSum > max){	// if we have a better rsum
				max = rSum;	// update the global
				start = k;	// updating start and end of max
				end= i;
			}
		}
		System.out.println(start+" - "+end);
		return max;
	}
}

/*********************************Brute Force*****************************/
//Time Complexity : O(n^2)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Maximum_Subarray_Brute_Force {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		int sum = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++){
			int curr = nums[i];
			sum = Math.max(sum, curr);
			for(int j=i+1; j<nums.length; j++){
				curr+= nums[j];
				sum = Math.max(sum, curr);
			}
		}
		return sum;
	}
}
