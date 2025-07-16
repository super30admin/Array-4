/*
Approach:
1) find the breach from end of the array towards the start , Breach is where nums[i-1] < nums[i]
982175321 in this example breach will happen at 1, right after seven.
2) Now we have to swap this element with next higher element from this index to end of the array
3)  in order find that element we again start from end of the array and compare with breached element, as soon as we find next higher element we swap this two elements
4) reverse the remaining array ( i+1 index till end of the array to get exact next permutation)

Time Complexity - O(N)
Space Complexity - O(1)
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
*/

public class NextPermutation_LC_31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length-1;
        int i = nums.length -2;
        while(i>= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i >=0){
            int j = len;
            while(nums[i] >= nums[j]) {
                j--;
            }//982175321
            swap(nums, i, j);
        }
        reverse(nums, i+1,len);

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    private void reverse(int [] nums, int i , int j) {
        while( i <= j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
}