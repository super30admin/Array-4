
/*
 * The complexity of the algorithm is O(n Log n) where n is no of elements in array.
 * 
 */

public class NextPermutation {

	public void nextPermutation(int[] nums) {

		if (nums.length == 0 || nums == null)
			return;

		int n = nums.length;
		int i = n - 2;

		// find the breach
		while (i >= 0 && nums[i] >= nums[i + 1]) {

			i--;
		}

		if (i >= 0) {

			int j = n - 1;

			while (nums[i] >= nums[j]) {

				j--;
			}

			swap(nums, i, j);

		}

		reverse(nums, i + 1, n - 1);

	}

	private void swap(int[] nums, int i, int j) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	private void reverse(int[] nums, int i, int j) {

		while (i <= j) {
			swap(nums, i, j);
			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
