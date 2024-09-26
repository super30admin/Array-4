// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//as per the graph plot, we can see that if we moved from RHS towards left , the index after the peak will become the next peak(peak_index)
//find the next peak element (from RHS , ele greater than the peak_index ele)
//swap the element at peak_index with the peak_ele
//to have the next perm itself, we need to reverse the elements after peak_index
//if we already at the greatest perm possible, then just reverse the numbers

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int peak_index=nums.length-2;
        while(peak_index>=0 && nums[peak_index]>=nums[peak_index+1]){
            peak_index--;
        }
        if(peak_index>=0){
           int peak_ele=nums.length-1;
            while(nums[peak_ele]<=nums[peak_index]){
                peak_ele--;
            }
            swap(nums,peak_index,peak_ele);
        }
        reverse(nums,peak_index+1,nums.length-1);
       
    }
    private void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;        
    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        
    }
}