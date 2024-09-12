//Time Complexity:O(N)

//SPace Complexity:O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        ;

        // step1 :Find first non decreasing element from right
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        // step 2:Find ele which just grater than first_decreasing in right part
        if (i >= 0) {
            int first_decreasing = nums[i];
            int j = nums.length - 1;

            while (j >= 0 && first_decreasing >= nums[j]) {
                j--;

            }
            // step 3 swap them
            swap(nums, i, j);

            // step 4 reverse array from next index of first_decreasing till end

        }

        reverse(nums, i + 1);

    }

    public void reverse(int[] nums, int start) {

        int i = start, j = nums.length - 1;

        while (i < j) {

            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}