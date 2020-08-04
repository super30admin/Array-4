// Time Complexity : O(n) --> where n is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (31): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        //edge case
        if (nums == null || nums.length == 0) return;
        
        // Step 1: find the ascending breach from end
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) i--;
        
        // i = -1 or at breach point
        // Step 2: find the digit to replace it with and swap i & j 
        int j = nums.length - 1;
        if (i >= 0) {
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        // Step 3: revrese
        reverse(nums, i+1 , nums.length-1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++; end--;
        }
    }
}