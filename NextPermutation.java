// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// to get next largest value, need to find point where nums[i] is less than nums[i+1]
// here the next possible number would be swap nums[i] with next largest in nums[i+1]->end of list
// reverse these elements which are in decreasing order, largest number to smallest to get next permutation 

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, nums.length-1);
    }
    
    private void reverse(int[] nums, int start, int end){
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
        
}