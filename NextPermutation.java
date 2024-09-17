// Time Complexity - O(n)
// Space Complexity - O(1)

// Approach
// Start from the end, and keep on decreasig the ith pointer till you find a decreasing number
// Then move the jth pointer from the end till you find nums[j] greater than the nums[i]. Swap the digits. 
// Reverse from i+1 till the end to get the next greater permutation.

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int j = nums.length-1;
        int i;
        for(i=nums.length-2;i>=0;i--) {
            if(nums[i+1] > nums[i]) break; // to find decreasing element
        }
        if(i>=0) {
            while(nums[j]<=nums[i]) {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    private void swap(int[] nums, int i, int j) {                                                   
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i) {                                                      
        int j = nums.length-1;
        while(i < j){
            swap(nums, i,j);
            i++;
            j--;
        }
    }
}