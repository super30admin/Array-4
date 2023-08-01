class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int first = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                first = i;
                break;
            }
        }
        if (first != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[first]) {
                    swap(nums, i, first);
                    break;
                }
            }
        }
        reverse(nums, first + 1);
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverse(int[] nums, int l) {
        int r = nums.length - 1;
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}