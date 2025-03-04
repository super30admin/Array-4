// In this problem, following 3 step approach:
// Step1: Start traversing from end and find the index of the element(index) which is smaller than the element to it's right
// Step2: Then again traverse from end till index found in first step and find the index (let's say j) of element which is just 
// greater than the element at index in step 1. Then swap two elements at index j and index index. 
// Step3: Then reverse the subarray from i+1 to n-1

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public void nextPermutation(int[] nums) {
        // Base Case
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        // Declare
        int index = -1;
        // 1. Start traversing from second last element and find the index of the
        // element(index) which is smaller than the element to it's right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        // Check if the valid index found and now it is not -1
        if (index != -1) {
            // In that case perform step 2
            int j = n - 1;
            while (j > index && nums[j] <= nums[index]) {
                j--;
            }
            // Swap the two
            swap(nums, j, index);
        }
        // Then reverse subarray
        reverse(nums, index + 1, n - 1);
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