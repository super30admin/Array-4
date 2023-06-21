import java.util.Arrays;
//Time Complexity : O(NlogN) 
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**
 * Sort the array in ascending order and pick the even elements to add. return
 * the total even sum.
 *
 */
class Solution {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}
