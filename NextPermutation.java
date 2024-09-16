class Solution {

    //Time Complexity: 0(n) where n is the no of elements in the array
    //Space Complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you fave any problem while coding: No

    //In brief, explain your approach

    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length; //finding out length
        int i = n - 2;  //placing i at 2nd last index so that we can compare last 2 elements and move left
        while(i >= 0 && nums[i] >= nums[i+1]){  //finding the breach where element which is smaller than the next element or keft element is smaller than right while comparing
            i--;
        }
        int j = n - 1;  //taking another pointer to traverse the array again from right end
        if(i >= 0){ //if there was a breach, i would stop at 0 or more. If it was the maximum permutation, then i would traverse entire array and end up at -1. then we just reverse the array and give the output
            while(j >= 0 && nums[j] <= nums[i]){    //searching for an element that is larger than nums[i] to swap and give a bigger permutation
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);    //we reverse from the swapped part to return just the next permutation

    }
    public void swap(int [] nums, int start, int end){  //function to swap in place
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void reverse(int [] nums, int start, int end){   //function to reverse in place
        while(start <= end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}