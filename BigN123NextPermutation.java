//Time complexity is O(n)
//Space complexity is O(1)
//This solution is submitted on leetcode

public class BigN123NextPermutation {
	class Solution {
		public void nextPermutation(int[] nums) {
			// edge case
			if (nums == null || nums.length == 0)
				return;

			// Step 1: to find i here after while loop break we get the i
			int i = nums.length - 2;
			int j = nums.length - 1;
			while (i >= 0 && nums[i] >= nums[i + 1])
				i--;

			// Step 2 : Find the j
			if (i >= 0) { 
				while (nums[i] >= nums[j])
					j--;
				swap(nums, i, j);
			}
			reverse(nums, i + 1, nums.length - 1);
		}

		private void swap(int[] nums, int i, int j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

		private void reverse(int[] nums, int start, int end) {
			while (start < end) {
				swap(nums, start, end);
				start++;
				end--;
			}
		}
	}
}