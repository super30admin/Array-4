//Time complexity is O(n)
//Space complexity is O(1)
//This solution is submitted on leetcode

public class BigN112MaximumSubArray {
	class Solution {
		public int maxSubArray(int[] nums) {
			// edge case
			if (nums == null || nums.length == 0)
				return -1;
			// we are not using any pointers local and global will take care of that
			int local = nums[0];
			int global = nums[0];
			for (int i = 1; i < nums.length; i++) {
				local = Math.max(local + nums[i], nums[i]);
				global = Math.max(local, global);
			}
			return global;
		}
	}
}