// Time Complexity : O(n) (since max n is 100, total iterations in worst case will be 250, so we can consider it O(1))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Part 1: From the end, find the first occurance where the number is decreasing(say it "i").
 * Part 2: Then, from end to i, find a number that is just greater than i (say it "j"). Swap i and j. If i is -1, skip part 2.
 * Part 3: reverse the array from i+1 to the end.
 */
class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]) i--; //Find the breach
        if(i>=0) { //If breach is there, find the immediate bigger number and swap
            int j = n-1;
            while(nums[j] <= nums[i])  j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1); //reverse
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while(i<j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}