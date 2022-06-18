// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int n = nums.length;
        int i = n - 2;
        
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        
        if(i >= 0) {
            int j = n - 1;
            
            while(j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i + 1, n-1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        
        while(start < end) {
            swap(nums, start++, end--);
        }
    }
}