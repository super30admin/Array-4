// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

/*
Approach
first we scan we array right to left(In a perfect number left digit will be smaller then right) if we find a breach we are supposed to
swap the number
to find the number to be swapped with again we scan the element from left to right the number immediately bigger then the first number is
the number to be swapped 
final step is to reverse the array from the breached number
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}