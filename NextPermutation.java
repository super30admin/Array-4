// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

// Start iteration from end of the array to find the 
// number with index i which is smaller than its right neighbor
// Swap ith pos number with immediate greater number
// Reverse the array from i + 1 to the end

class Solution {
    
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length == 0) return;
        
        int n = nums.length;
        
        int i = n - 2;
        
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        if(i >= 0) {
            int j = n - 1;
            while(j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int l, int r) {
        
        while(l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}