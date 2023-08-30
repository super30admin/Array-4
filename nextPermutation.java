// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
 * 1. Iterate from last element to first element, find the first element that is smaller than the element to its right.
 * 2. If such an element is found, find the element just greater than the element found in step 1.
 * 2. Swap the elements found in step 1 and 2.
 * 3. Reverse the array next to the element found in step 1 until the end of the array. 
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i >= 0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int left, int right){
        while(left <= right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}