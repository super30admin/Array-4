// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * We use the concept of fidnign the first decreasing element, 
 * find the number just larger than the element, swap them, then reverse the array
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            // find the element which is less than the next elements, that is the index to
            // be swapped for next permutation.
            if (nums[i + 1] > nums[i]) {
                index = i;
                break;
            }
        }
        // if elements are in descending order(3,2,1), then index will not be updated,
        // so the sorted order is the next permutations
        if (index == -1) {
            Arrays.sort(nums);
            return;
        }
        // else, if we have an index, then
        for (int i = n - 1; i >= index; i--) {
            // swap the index element with the greater than index element from end
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        int start = index + 1, end = n - 1; // start =2, end =2
        // reverse rest of the array
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
