/* Time Complexity : O(n)) 
 *  n - len of array - nums */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        //Find breach - Traverse from right - check ASC order - order breaks, we have a breach
        int i = n-2;//breach idx
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //If there is a breach find the idx to swap with
        //Traverse from right - digit greater than breach we have the idx to swap with
        if(i >= 0){
            int j = n - 1;//swap idx
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }

        // Reverse the array - after breach idx to end of array
        reverse(nums, i+1, n-1);

    }

    private void swap(int[] nums, int i, int j){
        //swap w/o temp
        if(i < j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }

    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}