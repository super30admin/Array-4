/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len-2;
        if(len ==1)
            return ;
        //traverse from the right and find first index where a[i-1] is greater than a[i]
        while(i>=0 && nums[i] >= nums[i+1])
            i--;
        //find the next number greater than i from the right
        int j= len-1;
        if(i>=0){
            while(j>= 0 && nums[j] <= nums[i]) 
                j--;
            swap(nums,i,j);
        }
        /*if elements are in the descending order we cant find next greater permuatation
        so we just reverse all the elements*/
        reverse(nums, i+1, len-1);
    }
    //Function to swap 2 numbers
    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //reverse an array 
    public void reverse(int[]nums, int start, int end){
        while(start<=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
