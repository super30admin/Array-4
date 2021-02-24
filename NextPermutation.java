// Time Complexity : The time complexity is O(n) where n is the length of array
// Space Complexity : The space complexity if O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i=n-2;

        // find the number which has to be replaced to get the very next number
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        // find the number to be swapped with
        if(i >= 0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }

        // reverse
        reverse(nums,i+1,n-1);

    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums,int start,int end){

        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}