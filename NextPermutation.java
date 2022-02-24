// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int i = n-2;
        //first find no which is smaller than the no to its right
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        //now swap it with its just greater no
        if(i >= 0) {
            int j = n-1;
            while(j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        //reverse rest of the numbers, i.e., sort in ascending
        reverse(nums, i+1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}