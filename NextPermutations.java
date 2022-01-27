// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Approach

// We iterate through the array in reverse
// When we get ith element > i+1, we conclude it as breach and record it as first
// Then we find the element greater than element at first and swap them
// we then reverse the array from the first
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int first = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
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
        reverse(nums, first + 1, n - 1);
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}