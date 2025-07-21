/*
 * TC: O(1). constraint givne in the question which states max. length of nums is 100.
 * SC: O(1).
 * 
 * Approach: start the pointer from the right(last second position). run until we get a num smaller than the previous. now, run 
 * another pointer from last position to the first pointer until we get a smallest number greater than the number at ptr1.Swap the numbers
 * at both the pointers and reverse all the elements from the ptr 1 and last element. 
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ptr = n-2;

        while(ptr >= 0 && nums[ptr] >= nums[ptr+1])
           ptr--;

        if(ptr >= 0){
            int j = n-1;
            while(j >= 0 && nums[j] <= nums[ptr])
                j--;
          swap(ptr,j,nums);
        }

        reverse(ptr+1, n-1, nums);
    }


    private void swap(int n1, int n2, int[] nums){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }


    private void reverse(int i, int j,int[] nums){
        while(i<j){
            swap(i,j, nums);
            i++;
            j--;
        }
    }
}