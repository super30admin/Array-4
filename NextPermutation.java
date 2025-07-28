// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : YES

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        int i = size - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        // Step 2: If not the last permutation
        if (i >= 0) {
            int j = size - 1;

            // Step 3: Find next greater element to swap
            while (nums[j] <= nums[i])
                j--;

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // reverse the tail
        reverse(nums, i + 1, size - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end)
            swap(nums, start++, end--);
    }

}