/**
LeetCode Submitted : YES
Space Compexity : O(1)
Time Complexity : O(N)

The idea is to check from last-1 index of the array and see and it which our nums[i+1] > nums[i] then find the smallest value nums[j] where we have nums[j] > nums[i]. After that we find the swapping of the elements and then do reverse the list from that position + 1. The reversing is the trick to get lexicographically small element. 

**/
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length < 1)
            return;
        
        int n = nums.length - 1;
        int i = n-1;
        
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }
        
        
        int j = n; 
        
        if(i>=0){
            while(j>=0  && nums[j] <= nums[i]){
                j--;
            }
            
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        
    }
    
    private void swap(int[] nums, int a , int b){
        int temp = nums[a];
        nums[a]  = nums[b];
        nums[b]  = temp;
    }
    
    private void reverse(int[] nums, int leftPos){
        int rightPos = nums.length -1;
        while(leftPos < rightPos){
            swap(nums,leftPos,rightPos);
            leftPos++;
            rightPos--;
        }
        
    }
}
