//Time Complexity:O(N)
//SPace Complexity:O(1)
//Approach- For example if I have an array nums=[2,3,6,5,4,1], I'll start at the last index and keep moving my first pointer until I find a number that breaks the descending order , in this case it is 3. I'll again move another pointer from the last element and find the immediate largest element of the element pointed by my first pointer. I'll swap these two  numbers and the reverse the remainder of the array starting from the element next to my first pointer till the last element of the array. If all the elements are in the descending order, Then I'll be just reversing the entire array such that all the elements are in the ascending order.
//This code was executed successfully and got accepted in leetcode.

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0){
            return;
        }
        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>=0&&nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    public void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}