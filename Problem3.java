// Time Complexity : O(n) where n is the number of items in nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Take one element at a time from the array and see if the running sum is greater than the current number.
 * If the running sum is greater than current number, then expand the current window since our new
 * If the number is greater than the current window, then we can discard the current window and start a new window from current element.
 * For each element, check the current window's sum against the max and set the max.
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // find the first breach by checking if the numbers are increasing from the back
        // when number decreases, then we found our first breach
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // replace the breach in the place where the number will be just greater than the breach
        int j = n - 1;
        if (i >= 0) {
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        // replace the number from breach onwards to get the next biggest number
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}