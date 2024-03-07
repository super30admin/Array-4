// https://leetcode.com/problems/next-permutation/

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void nextPermutation(int[] nums) {

        int actionDigitIdx = -1;
        // Step 1: Finding the action digit
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                actionDigitIdx = i;
                break;
            }
        }

        if(actionDigitIdx >= 0) {
            // Step 2: Finding the smallest digit to the right of
            // actionDigit that is greater than actionDigit
            int swapDigitIdx = -1;
            for (int i = nums.length - 1; i > actionDigitIdx; i--) {
                if (nums[i] > nums[actionDigitIdx]) {
                    swapDigitIdx = i;
                    break;
                }
            }
            // Step 3: Swap actionDigit with swapDigit
            swap(nums, actionDigitIdx, swapDigitIdx);
        } else if (actionDigitIdx == -1) {
            // if the list is sorted, reverse whole
            reverse(nums, 0 , nums.length - 1);
            return;
        }

        // Step 4: Reverse the portion of the array to the right of actionDigit
        reverse(nums, actionDigitIdx + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        if(i != j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
