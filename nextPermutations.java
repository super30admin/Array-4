// Time Complexity : o(3n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 31
//Approach : Case study


class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length ==0) return ;
        int n = nums.length;
        int i = n-2;
        //find the breach
        while(i>=0 && nums[i+1] <= nums[i]){
            i--;
        }
        
        //swap
        if(i>=0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        
        //reverse
        reverse(nums, i+1 , n-1);
    }
    
    public void reverse(int nums[], int lo, int hi) {
        while(lo < hi) {
            swap(nums, lo, hi);
            lo++;
            hi--;
        }
    }
    
    public void swap(int nums[], int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}