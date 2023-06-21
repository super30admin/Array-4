class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int index = -1;

        // step 1: Locate the index of the element ehich is smaller than the element to
        // its right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;

            }
        }

        // find and swap the element with which it is greater
        if (index != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }
        }

        // reverse the portion of the array from index + 1 to the end

        reverse(nums, index + 1, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }

}