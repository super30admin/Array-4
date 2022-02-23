// Time Complexity : O(n); where n = size of the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // find the breaching/operating index
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        
        if(i >= 0){
        // find the number on right side to swap with
            int j = n - 1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        
        // reverse the digits on right of breach 
        reverse(nums, i + 1, n - 1);   
    }
    
    private void reverse(int [] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}