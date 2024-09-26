//https://leetcode.com/problems/next-permutation/
/*
Time: O(n) where n = nums.length
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // Step1. Find first decreasing seq from end. Stop once you find a next lesser
        // elem
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        // Step2. Find the number for substitution(next greater elem) in the right side
        // & perform a swap
        if (i >= 0) {
            int j = nums.length - 1;

            while (j >= 0 && nums[j] <= nums[i])
                j--; // keep going until you find the next greater number to the left, after this
                     // point

            swap(nums, i, j); // swap that number and next greater number
        }

        reverse(nums, i + 1); // reverse i+1 all the way until n
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;

        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}
