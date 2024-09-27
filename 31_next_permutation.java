    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/next-permutation/
    Time Complexity for operators : o(n) .. n is the length of the array
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 
        # Optimized approach: 
                              
            # 1. 
                    A) try to find peak from last.
                    B) Then once you find it  find the next element that we can replace with it.
                    C) again find from last and check of element is greater than the on we found in B step.
                    D) Once we found both, swap them.
                    E) After swap, revsere  next all elements.
    */ 

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        
        // find peak from last
        int peak_index = nums.length - 2;
        
        while(peak_index >= 0 && nums[peak_index] >= nums[peak_index+1]){
            peak_index -= 1;
        }
        
        
        if(peak_index >= 0){
            int peak_element = nums.length - 1;
            while(nums[peak_element] <= nums[peak_index]){
                peak_element -= 1;
            }
            
            swap(nums, peak_index, peak_element);
        }
        
        // revsere remaining array
        reverse(nums,  peak_index+1, nums.length - 1);
    }
    
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int nums[], int start, int end){
        
        while(start < end){
            swap(nums, start,end);
            start += 1;
            end -= 1;
        }
    }
}