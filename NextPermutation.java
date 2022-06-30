/**
Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/
class Solution 
{
    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length ==0)
            return;

        int index = nums.length -1;
        boolean found = false;

        /**
         * the last comparison is of the element at index 1 with index 0
         * if the breach is still not found then it means that the current element is largest
         * and we have to get the next largest by reversing the whole number
         */
        while(index > 0 && !found) {
            if(nums[index-1] < nums[index]) {
                found = true;
            }
            index--;
        }


        if(!found) {
            reverse(nums, 0, nums.length -1);
        }
        else {
            int value = nums[index];
            int greaterIndex = nums.length -1;

            /**
             * from the last index find the first value greater than then the value at breach index
             * and then swap the values at those indexes
             */
            while(nums[greaterIndex] <= value) {
                greaterIndex--;
            }

            swap(nums, index,greaterIndex);

            /**
             * from the index just next to the breach index reverse the whole array
             */
            reverse(nums, index+1, nums.length-1);
        }

    }

    /**
     *
     * This method reverse the array in between the two indexes
     *
     * @param nums
     * @param i
     * @param j
     */
    private void reverse(int nums[], int i, int j) {
        while(i <=j) {
            swap(nums, i,j);
            i++;
            j--;
        }
    }

    /**
     *
     *  This method swaps the values at the provided indices
     *  
     * @param nums
     * @param i
     * @param j
     */
    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}