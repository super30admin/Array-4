// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.Arrays;

class Main {

    public static void nextPermutation(int[] nums) {
        // null case
        if (nums == null || nums.length == 0)
            return;
        int n = nums.length;
        // find the breach (first decreasing element) from the right side
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // find first element that is greater than our element at breaching index
        int j = n - 1;
        if (i >= 0) {
            while (nums[i] >= nums[j]) {
                j--;
            }
            // swap those two element;
            swap(nums, i, j);
        }
        // reverse the remaining
        reverse(nums, i + 1, n - 1);

    }

    // swap function
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // reverse
    private static void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4, 9, 7, 5, 3, 1 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}