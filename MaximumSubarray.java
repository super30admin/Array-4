import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//53. Maximum Subarray (Medium) - https://leetcode.com/problems/maximum-subarray/
class Solution {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int n = nums.length;
		int max = nums[0], currSum = nums[0];
		int currStart = 0;
		int start = 0, end = 0;

		for (int i = 1; i < n; i++) { // O(n)
			currSum += nums[i];

			if (currSum < nums[i]) {
				currStart = i;
				currSum = nums[i];
			}

			if (currSum > max) {
				max = currSum;
				start = currStart;
				end = i;
			}
		}

		return max;
	}
}