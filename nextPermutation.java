// Time Complexity = O(n)
// Time Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int n=nums.length, index=-1;    // initializing index to -1 since we want to check for all descending order elements
        // traverse the array and find the first occurance where nums[i] < nums[i+1]
        // Once you find the index i, save it
        // Traverse from the end again to find the first element that is greater than ith element, and swap them
        // Now reverse the array after ith index.

        for (int i=n-2; i>=0; i--) {
            if (nums[i] < nums[i+1]) {
                index=i;
                break;
            }
        }

        if (index >= 0) {       // This will exclude the case where all the elements are in descending order, in that case we wil have to reverse the whole array
            for (int j=n-1; j>index; j--) {
                if (nums[j] > nums[index]) {
                    // swap once we find the first occurance of element at index j being greater than index value
                    swap(nums, index, j);
                    break;
                }
            }
        }

        // Reverse the part of the array after index
        reverse (nums, index+1, n-1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}