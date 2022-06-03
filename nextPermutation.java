/*
Problem: https://leetcode.com/problems/next-permutation/
*/

// TC: O(n)
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int n = nums.length;
        // Step 1: find breach
        int i = n - 2;
        while (i >= 0) {
            if (nums[i] >= nums[i+1]) {
                --i;
            } else {
                break;
            }
        }
        
        if (i == -1) {
            reverse(nums, 0);
            return;
        }
        
        // Step 2: find number greater than nums[i] and swap
        int j = n - 1;
        while (j >= 0 && nums[j] <= nums[i]) {
            --j;
        }

        swap(nums, i, j);
        // Reverse the rest of the numbers
        reverse(nums, i + 1);
    }
    
    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int nums[], int i) {
        int j = nums.length - 1;
        
        while (i <= j) {
            swap(nums, i, j);
            ++i; --j;
        }
    }
}