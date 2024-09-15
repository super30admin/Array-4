// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes

class Solution {
    public void nextPermutation(int[] nums) {
        boolean isBreachFound = false;
        int breach = 0;
        // find the breach
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                isBreachFound = true;
                breach = i;
                break;
            }
        }
        // if breach is found, find the number just greater than breach
        if (isBreachFound) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[breach]) {
                    // if found swap
                    swap(nums, i, breach);
                    break;
                }
            }
            // reverse from next to breach till end
            reverse(nums, breach + 1, nums.length - 1);
        } else {
            reverse(nums, 0, nums.length - 1);
        }
    }

    // method to swap
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // method to reverse
    public void reverse(int[] nums, int i, int j) {
        int start = i;
        int end = j;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}