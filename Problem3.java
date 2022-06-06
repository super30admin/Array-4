// Time Complexity : O(n) where n is the size of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        
        int n = nums.length;
        
        int i = n - 2, j = n - 1;
        
        while(i >= 0 && nums[i] >= nums[j]) {
            i -= 1;
            j -= 1;
        }
        
        j = n - 1;
        
        if(i < 0) {
            reverse(nums, i+1, n -1);;
            return;
        }
        
        while(i >= 0 && nums[i] >= nums[j]) {
            j -= 1;
        }
        
        swap(nums, i, j);
        reverse(nums, i+1, n -1);
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int i, int j) {
        while(i < j) {
            swap(nums, i, j);
            i += 1;
            j -= 1;
        }
    }
}