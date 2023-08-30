// Time Complexity : O(n)  -> O(1) constant since there are limited number of digits (1 to 9)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

package org.example;
public class NextPermutation {
    public void nextPermutation(int[] nums) {

        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]) i--;     // find the breach
        int j=nums.length-1;
        if(i>=0){                               //find bigger number than the breach and swap
            while(nums[j] <= nums[i])j--;
            swap(nums,i,j);
        }
        reverse(nums, i+1,nums.length-1);   // this will be the largest, reverse to get the smallest number
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int l, int r){
        while(l<=r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
}
