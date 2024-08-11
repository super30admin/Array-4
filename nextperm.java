// Time Complexity : 0(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int n = nums.length;
        int i = n - 2;
        // Step: 1 Finding out number that is less than the number on the right of it
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // Step: 2 Swapping with the next largest number
        if (i != -1) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // Step: 3 Reversing the sub array where 1. was found.
        reverse(nums, i + 1, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}