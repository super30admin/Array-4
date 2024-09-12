// Time Complexity :O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length==0) return;
        int  n = nums.length;
        int i = n-2;
        while(i>=-1){
            if(i==-1){
                reverse(0,n-1,nums);
                break;
            }
            if(nums[i+1]>nums[i]){
                swap(i,nums);
                break;
            }
            i--;
        }
        if(i!=-1)reverse(i+1,n-1,nums);
        
        
        
    }
    
    private void swap(int index , int[] nums){
        for(int i = nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
    }
    private void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp  = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}