//TC: O(n)
//SC: O(1)
//approach: find 1st decreasing from right, find its next maximum, swap them, and reverse right part of array

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0) return;

        int i = nums.length - 2;
        //finding first decreasing element from right to left
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        //find second most largest to i, and swap them
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
