// source https://www.youtube.com/watch?v=ZoNocvXkX2E&feature=youtu.be
//https://leetcode.com/problems/next-permutation/
//time o(n)
//space o(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length ==0)
            return;
        
        int len = nums.length;
        //find the first smallest number from the last
        int i;
        for(i=len-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                break;
            }
        }
        
        //find the largest element greater than the found smallest from the end of the array
        int j;
        if(i>=0) {
            for(j=len-1; j>=0; j--) {
                if(nums[j] > nums[i]) {
                    break;
                }
            }
            swap(i, j, nums);
        }
        //now reverse the elemennts from i+1 index for getting the next perumutation
        reverse(nums, i+1);
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int idx) {
        int last = nums.length-1;
        while(idx < last) {
            swap(idx, last, nums);
            last--;
            idx++;
        }
    }
}