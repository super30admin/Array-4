// Time Complexity = O(n)
// Time Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max=nums[0], currSum=nums[0], n=nums.length;

        for (int i=1; i<n; i++) {
            // We decide at each index if we would like to carry forward the previous max subarray or start a new one
            currSum = Math.max(currSum+nums[i], nums[i]);
            // we check max everytime to make sure we have updated max value
            max = Math.max(max, currSum);
        }

        return max;
    }
}