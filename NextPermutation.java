// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        
        if(i==-1) {
            reverse(nums, 0, nums.length-1);
            return;
        }
        
        // find the next nuumber index just greater than nums[i] and swap
        int j = nums.length-1;
        while(nums[j]<=nums[i])
            j--;
        
        swap(nums, i, j);
        reverse(nums, i+1, nums.length-1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}
