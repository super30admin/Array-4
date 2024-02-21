/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n(finding action digit) + n(finding replacement) + n(reverse)) = O(3n)
* 
* Space Complexity: O(1)
* 
*/

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int actionDigitIdx, index = n - 2;

        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }

        actionDigitIdx = index;

        if (actionDigitIdx != -1) {
            for (int i = n - 1; i > actionDigitIdx; i--) {
                if (nums[actionDigitIdx] < nums[i]) {
                    swap(nums, actionDigitIdx, i);
                    break;
                }
            }
        }
        reverse(nums, actionDigitIdx + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int start, int end) {
        if (start != end) {
            nums[start] = nums[start] + nums[end];
            nums[end] = nums[start] - nums[end];
            nums[start] = nums[start] - nums[end];
        }
    }
}
