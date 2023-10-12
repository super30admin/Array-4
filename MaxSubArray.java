class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null && nums.length == 0)
            return 0;
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;

    }
}