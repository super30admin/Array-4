//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int idx = -1;

        // Step 1: to find an element on the left smaller than element on the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // Step 2: to find a no. greater than the idx number on the right side and swap
        // them
        if (idx != -1) {
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[idx]) {
                    swap(nums, idx, i);
                    break;
                }
            }
        }

        // Step 3: to sort/reverse the nos right of the idx
        reverse(nums, idx + 1, n - 1);

    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
