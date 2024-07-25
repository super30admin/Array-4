class Solution {
    public int maxSubArray(int[] nums) {
        // Tc: O(n) Sc: O(1)
        int n = nums.length;

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}