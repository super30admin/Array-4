/**
 * Time Complexity: O(n)
 * Space COmplexity: O(1)
 * Leetcode : Yes
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int ptr1 = nums.length-1;
        // find non decreasing point
        while(ptr1 > 0 && nums[ptr1] <= nums[ptr1-1]) {            
                ptr1--;            
        }
        
        if(ptr1 > 0) {
            int ptr2 = nums.length-1;
            
            while(ptr2 > 0 && nums[ptr1-1] >= nums[ptr2]){
                ptr2--;
            }
            
            swap(nums, ptr1-1, ptr2);
            reverse(nums, ptr1, nums.length-1);
            
        }
        else {
            System.out.print("55");
            reverse(nums, 0, nums.length-1);
        }
        
    }
    
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
        swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    }
