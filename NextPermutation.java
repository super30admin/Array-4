// Time Complexity : O(N) // 3 pass so 3N
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * 1. it is 3 pass algorithm.
 * 2. find breach. find the index which is less than its next element.
 * 3. if found find last small element index to current breach index and swap it.
 * 4. reverse the numbers from index breach+1 to end.
 * 
 */
public class NextPermutation {
	public void nextPermutation(int[] nums) {

		int n = nums.length;
		// find breach
		int i = n - 2;
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		// if breach found
		if (i >= 0) {
			int j = n - 1;
			while (nums[i] >= nums[j]) {
				j--;
			}
			swap(nums, i, j);
		}

		// reverse from i+1 to end
		reverse(nums, i + 1, n - 1);

	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	private void swap(int[] nums, int in1, int in2) {
		int temp = nums[in2];
		nums[in2] = nums[in1];
		nums[in1] = temp;
	}
}
