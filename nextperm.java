//Time: O(n)
//Space :O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null)
            return;
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);

    }

    private void reverse(int[] nums, int i, int j) {
        int low = i;
        int high = j;
        while (low <= high) {
            swap(nums, low, high);
            low++;
            high--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}