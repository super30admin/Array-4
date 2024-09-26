//TC: O(n)
//SC: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
     int n = nums.length;
        int i = n - 2;
        
        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: If such an element is found, find the next largest element
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap the elements
            swap(nums, i, j);
        }
        
        // Step 4: Reverse the subarray after the first decreasing element
        reverse(nums, i + 1, n - 1);
    }
    
    // Helper method to swap two elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper method to reverse the subarray
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
