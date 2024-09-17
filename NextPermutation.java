package Array4;

/*S30 FAANG Problem #124 {Medium } - https://www.youtube.com/watch?v=7SQIOmwZwDI
    Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

    If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

    The replacement must be in-place and use only constant extra memory.

    Example:

    1,2,3 → 1,3,2
    3,2,1 → 1,2,3
    1,1,5 → 1,5,1

    Source Link: https://leetcode.com/problems/next-permutation/
        -------------------------------------------------------------------------------------------------------
        Time complexity : O(N) 
        space complexity: O(1) 
        Approach:
        Did this code run successfully in leet code : yes
        problems faces : no*/

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        if (nums == null || nums.length == 0)
            return;

        int n = nums.length;
        int i = n - 2; 

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--; //breach occured
        }

        if (i >= 0) {
            //right element to swap
            int j = n - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

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
