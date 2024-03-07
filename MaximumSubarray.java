// https://leetcode.com/problems/maximum-subarray/

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int result = 0;
        int i = 0;
        int max = Integer.MIN_VALUE;
        while( i < nums.length) {
            result += nums[i];
            result = Math.max(result, nums[i]);
            max = Math.max(result, max);
            i++;
        }

        return max;
    }
}

