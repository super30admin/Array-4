// Time complexity: O(n)
// Space complexity: O(1)

// Approach: We have 2 variables current sum and max sum. The current sum takes care of the running sum and contains the maximum between currentsum + currentelement and currentelement. We update max sum if it is greater that current sum.

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // If current subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}