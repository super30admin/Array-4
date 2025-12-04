// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/description/

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int start = 0;
        int end = 0;

        int currSum = nums[0];
        int max = nums[0];

        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            int prefix = currSum + nums[i];

            // if prefix is smaller, reset currSum
            if (prefix < nums[i]) {
                tempStart = i;
                currSum = nums[i];
            } else {
                currSum = currSum + nums[i];
            }

            if (max < currSum) {
                start = tempStart;
                max = currSum;
                end = i;
            }
        }

        return max;
    }
}