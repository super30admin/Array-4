// Time Complexity : O(n), n -> Number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem3;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}

		int n = nums.length;
		int i = n - 2;

		// Find the point of breach
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		if (i >= 0) {
			// Find the next largest element
			int j = n - 1;
			while (nums[i] >= nums[j]) {
				j--;
			}
			swap(nums, i, j);
		}
		reverse(nums, i + 1, n - 1);
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	}

	private void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}

	private void print(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		NextPermutation obj = new NextPermutation();
		int[] nums = { 2, 1, 3 };
		System.out.println("Given array: ");
		obj.print(nums);
		System.out.println("Next Permutation:");
		obj.nextPermutation(nums);
		obj.print(nums);
	}

}
