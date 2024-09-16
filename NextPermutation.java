// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// To find the next permutation we need to find the next greater number
// To find the next greater number we will traverse from the end
// When we find a no. which is lesser than tha previous
// This means we need to swap it with a number which is just greater to it
// So as to get the number. We will find the number and reverse
// Also, Next to the current should be sorted in ascending order
// For this we can just reverse that part of array to get this as
// that would be in descending order
class Solution {
    public void nextPermutation(int[] nums) {
       int i = nums.length - 2;
        while(i >= 0 && nums[i+1] <= nums[i])
            i--;
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i , j);
        }
        reverse(nums, i+1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int l){
        int r = nums.length - 1;
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}