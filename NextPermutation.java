class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int i = n - 2;
        for (; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        if (i != -1) {
            int j = n - 1;
            for (;j >= 0 && j > i; --j) {
                if (nums[i] < nums[j]) {
                    break;
                }
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void reverse(int nums[], int left, int right) {
        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int nums[], int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}