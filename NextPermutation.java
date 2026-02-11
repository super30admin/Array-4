// Time Complexity : O(2n) = O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Find the first dip from the right where the array stop increasing
//  replace it with the next greatest element from the right
// reverse the right of dip + 1 to get the smallest permutation
//  if whole array is increasing (dip == -1) reverse the whole array

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        if (i == -1)
            reverse(nums, 0, n - 1);
        else {
            int j = n - 1;
            while (nums[i] >= nums[j])
                j--;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            reverse(nums, i + 1, n - 1);
        }
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}