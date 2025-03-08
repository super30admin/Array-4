//Time Complexity - O(n)
//Space Complexity - O(1)
class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int i = 0;
        for (i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                break;
            }
        }

        for (int j = n - 1; j > 0; j--) {
            if (i>0 && nums[j] > nums[i-1]) {
                swap(nums, i - 1, j);
                break;
            }
        }

        reverseArray(nums, i, n - 1);
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverseArray(int[] nums, int l, int r) {
        if (nums == null || nums.length == 0) {
            return;
        }
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
