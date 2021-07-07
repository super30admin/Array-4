// Time Complexity - O(n) where n is the number of elements in the array
// Space Complexity - O(1) 
// This solution worked on LeetCode

// In this problem to find the next permutation
Step 1: traverse from the second last element of the array to the left until there is an element which is less than it's next element.
ie nums[i] >= nums[i+1] -> i--

Step 2: if there is an element found than it needs to be swaped with the first element from the right side that is greater than this element at ith position found. 

Step 3: reverse the array from the i+1 position till the end of the array

class Solution {
    public void nextPermutation(int[] nums) {
    // Step1
        int i=nums.length - 2;
        while(i >=0 && nums[i] >= nums[i+1]) i--;
     // Step 2
        int j = nums.length -1;
        if(i >= 0){
            while(j >= 0 && nums[j] <= nums[i]) j--;
            swap(nums,i,j);    
        }
     // Step3
        reverse(nums, i+1, nums.length-1);
    }
    private void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;end--;
        }
    }
}
