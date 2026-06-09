// Time Complexity : O(n) as we traverse the array a few times (in total linear time)
// Space Complexity : O(1) as we are using constant extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We follow the steps to find the next permutation:
// 1. We find the rightmost pair of indices (i, i+1) where nums[i] < nums[i+1]. This identifies the pivot point where the order can be changed. 
// If no such pair exists, it means the array is in descending order, and we can simply reverse the entire array to get the lowest order (first permutation).
// 2. If we found such a pair, we then look for the rightmost index j where nums[j] > nums[i]. This is the element just larger than the pivot element.
// We swap the elements at indices i and j to create a slightly larger permutation.
// 3. Finally, we reverse the subarray from index i+1 to the end of the array to get the next permutation in place. This ensures that we get the smallest possible order for the suffix, which is necessary to get the next permutation. 
// This approach ensures that we find the next permutation in O(n) time, as we may need to traverse the array a few times, but each traversal is linear. The space complexity is O(1) since we are modifying the array in place without using any additional data structures.


public class Solution {

    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        // Step 1: find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: find just larger element and swap
        if (i >= 0) {

            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Step 3: reverse suffix
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
} 
