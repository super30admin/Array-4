// Time complexity: O(n)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        // find the breach
        int i = n - 2;
        // reverse iterate through the array until we find a larger element on the left side
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        // find the replacement if the array is not in ascending order and we have not found breach in the previous step
        // find the element which is just next in value to the breach and swap it with the breach
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        // reverse rest of the array
        reverse(nums, i + 1, n - 1);
    }
    // function to reverse an array within given indices
    private void reverse(int[] nums, int l, int r){
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    // function to swap two elements in an array
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}