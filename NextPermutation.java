// Problem 31. Next Permutation
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;  // Check for null and single element
        int n = nums.length;
        int i = n - 2;
        // Find the breaching digit which can be swapped later
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // If a breaching element was found
        if (i >= 0) {
            // Swap it with the digit just greater than the current breaching digit
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // Reverse the numbers after the breaching point to get the next permutation
        reverse(nums, i + 1, n - 1);
    }
    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
