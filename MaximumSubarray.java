// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int runsum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			runsum += nums[i];
			if (runsum < nums[i]) {
				runsum = nums[i];
			}

			if (max < runsum) {
				max = runsum;
			}
		}

		return max;
	}
}
