import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//31. Next Permutation (Medium) - https://leetcode.com/problems/next-permutation/
class Solution {
	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length == 0)
			return;

		int n = nums.length;
		int i = n - 2;

		// find the breach
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		// find the element to the right of breach which is just greater than the
		// current element that is found at breach
		if (i != -1) {
			int j = n - 1;
			while (nums[i] >= nums[j]) {
				j--;
			}
			swap(nums, i, j);
		}

		// reverse elements from i+1 till end
		reverse(nums, i + 1, n - 1);
	}

	private void swap(int[] nums, int i, int j) {
		if (i != j) {
			nums[i] = nums[i] + nums[j];
			nums[j] = nums[i] - nums[j];
			nums[i] = nums[i] - nums[j];
		}
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start++, end--);
		}
	}
}
