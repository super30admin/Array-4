// Time Complexity : O(n) because we scan the array a constant number of times
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We find the first decreasing element from the right, which marks the pivot where the next permutation can be formed.
// Then we swap it with the smallest larger element on its right side.
// Finally, we reverse the suffix to obtain the next lexicographically smallest arrangement.

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // find pivot
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--;

        if(i >= 0) {

            // find next larger element
            int j = n - 1;
            while(nums[j] <= nums[i]) j--;

            swap(nums, i, j);
        }

        // make suffix increasing
        reverse(nums, i + 1, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while(l < r) {
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