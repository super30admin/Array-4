//Time complexity is O(nlogn)
//Space complexity is O(1)
//This solution is submitted on leetcode

import java.util.Arrays;

public class BigN121ArrayPartitionInpairs {
	class Solution {
		public int arrayPairSum(int[] nums) {
			// edge case
			if (nums == null || nums.length == 0)
				return 0;
			Arrays.sort(nums);
			int sum = 0;
			for (int i = 0; i < nums.length; i = i + 2) {
				sum += nums[i];
			}
			return sum;
		}
	}
}