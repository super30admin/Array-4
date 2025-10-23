// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
Idea is to find the next highest permutation by finding the breach element while checking from right
If the element is decreasing then it has to be swapped with its next highest number
Once swapped reverse from the next index till the end of array to get the next permutation
if the given array is already at the highest permutation then return the reversed array as its next permutation
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        //Step1: Find the breach ie decreasing number
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        //Step2: Found the breach element , find next highest number
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        //step3: Reverse the rest part
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
