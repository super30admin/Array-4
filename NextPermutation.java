//  Time complexity - O(n)
// Space complexity -O(1)
//Solved on leetcode - yes
//FAced any issues - NO
// The algorithm finds the first index i from the end where nums[i] < nums[i + 1], then swaps it with the next larger element on its right. Finally, it reverses the subarray from i + 1 to the end to get the next lexicographically greater permutation.
class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        if (i < 0) {
            reverse(nums, 0, nums.length - 1);
        } else {
            int a = getNextLargestIndex(nums, i);
            int temp = nums[a];
            nums[a] = nums[i];
            nums[i] = temp;
            reverse(nums, i + 1, nums.length - 1);
        }
    }

    public void reverse(int nums[], int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public int getNextLargestIndex(int nums[], int i) {
        int index = i + 1;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] > nums[i] && nums[j] <= nums[index]) {
                index = j;
            }
        }
        return index;
    }
}
