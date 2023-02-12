// Approach: Kadane's algorithm (DP): Keep adding the no.s if sum < 0, reset the sum to 0 and continue
// Also, maintain a maxSum. Finally, return the maxSum
// Time: O(n)
// Space: O(1)

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i<nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}