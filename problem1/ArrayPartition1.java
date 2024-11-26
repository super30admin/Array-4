// Time Complexity : O(nlog n), n -> Number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem1;

import java.util.Arrays;

public class ArrayPartition1 {
	public int arrayPairSum(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		Arrays.sort(nums);

		int sum = 0;

		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		ArrayPartition1 obj = new ArrayPartition1();
		int[] nums = { 6, 2, 6, 5, 1, 2 };

		System.out.println("Maximized Sum: " + obj.arrayPairSum(nums));
	}

}
