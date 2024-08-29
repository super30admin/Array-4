//Time = O(n), length of input array
//Space = O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // Find the largest index i such that nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if (i >= 0) {
            // Find the largest index j greater than i such that nums[j] > nums[i]
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }
        // Reverse the sub-array nums[i+1:]
        reverse(nums, i+1, nums.length-1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
