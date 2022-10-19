// Time complexity: O(n)
// Space complexity: O(1)

// Approach: find bread by scanning array from right to left. Breach is when increasing order is not maintained. That means we can find the next permuation by changing the right side of breach. Left side does not need to be changed as we need to find only the next largest permutation. Then once we find the breach, we need to swap with next larger element on the right, as we can find the next largest permuation using that. Then finally, reverse all elements after the breach that way we can find the next largest permutation.

class Solution {
    public void nextPermutation(int[] nums) {
        // 1. find breach from the right to left of array where increasing order is breached
        int i = nums.length-2;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        
        // 2. swap breach with next greater number on the right if i is not negative. If i is negative, that means we cannot find a greater permutation so we don't need to swap and can directly reverse the array as that will be the next permutation (lowest permutation)
        if (i >= 0) {
            int j = nums.length-1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap (nums, i, j);
        }
        // 3. reverse all items after i
        reverse (nums, i + 1, nums.length-1);
    }
    
    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}