class Solution {
    public void nextPermutation(int[] nums) {

        if (nums.length <= 1)
            return;

        int i = nums.length - 2;
        while (nums[i] >= nums[i + 1]) {
            i--;
            if (i == -1) {
                break;
            }
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);

    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}