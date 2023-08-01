package Array4;

/**
 * We traverse the array from right to left, looking for two consecutive
 * elements such that left<right. The smaller element found can now be swapped
 * with the immediate larger element in the range [right,end of arr] and then
 * the subarr [right,end of arr] is reversed.
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem3 {
	public void nextPermutation(int[] nums) {
		int curr = nums.length - 2;
		boolean flag = false;

		while (curr >= 0) {
			if (nums[curr] < nums[curr + 1]) {
				for (int i = nums.length - 1; i >= curr; i--) {
					if (nums[curr] < nums[i]) {
						swap(curr, i, nums);
						flag = true;
						break;
					}
				}
			}
			if (flag)
				break;
			curr--;
		}

		if (curr < 0) {
			reverse(0, nums);
		} else
			reverse(curr + 1, nums);
	}

	void reverse(int idx, int[] nums) {
		int left = idx;
		int right = nums.length - 1;

		while (left <= right) {
			swap(left, right, nums);
			left++;
			right--;
		}
	}

	void swap(int idx1, int idx2, int[] nums) {
		int temp = nums[idx1];
		nums[idx1] = nums[idx2];
		nums[idx2] = temp;

	}

}
