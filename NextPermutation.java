// # Time Complexity:  O(n) where n is the length of nums
// #  Space Complexity:  O(1) 
// #  Did this code successfully run on Leetcode : Yes
// #  Any problem you faced while coding this : No

class Solution {
    public void nextPermutation(int[] nums) {

        // find pair smaller LHS > RHS and reverse from there
        // replace at index the next greater element in RHS. Replace and reverese from that index
        // if we dont find, reverse entire array 

        if(nums == null || nums.length == 0) {
            return;
        }

        int index = -1; // index where breach happens
        int n = nums.length; 
        int i = n - 2;

        //find the element smaller than element on right
        while(i >=0 && nums[i] >= nums[i+1]) {
            i--;
        }

        int j = n-1;

        // find value just greater from end 
        if( i >= 0) {
                while( j>= 0 && nums[j] <= nums[i]) {
                    j--;
                }

                swap(nums,i,j);
        }
        reverse(nums, i + 1);
        
    }

    public void swap(int[] nums,int  i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums,int  start) {
        int end = nums.length-1;
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
