// Time Complexity : O(n) n -> size of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Need to find the first decreasing point from last element.
// The number found will be swapped with the first larger element found in reverse order.
// reverse entire string to the right of the swapping position.

class Solution {
    public void nextPermutation(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0)
            return;
        
        int n = nums.length;
        // get the first decreasing point
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        
        // get the first larger no. greater than nums[i]
        int j = n-1;
        while(j >= 0 && i >= 0 && nums[j] <= nums[i])
            j--;
        
        // swap nums[i] and nums[j]
        if(i >= 0 && j >= 0) {
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
