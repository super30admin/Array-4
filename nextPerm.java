// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    // Method to reverse the subarray from start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Method to swap two elements in the array
    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Find the first element that is smaller than the next one (breach)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;  // Store the index of the breach
                break;      // Exit loop after finding the breach
            }
        }

        // If no breach is found, the array is in descending order
        if (index == -1) {
            // Reverse the entire array to get the smallest permutation
            reverse(nums, 0, n - 1);
        } else {
            // Find the smallest element larger than nums[index] in the remaining part
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[index]) {
                    // Swap the breach element with this element
                    swap(nums, index, i);
                    // Reverse the remaining part of the array to get the next permutation
                    reverse(nums, index + 1, n - 1);
                    break;  // Exit loop after performing the swap and reverse
                }
            }
        }
    }
}
