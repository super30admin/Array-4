class Solution {
    public int maxSubArray(int[] nums) {

        int runningSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            runningSum = Math.max(runningSum + nums[i], nums[i]);
            max = Math.max(max, runningSum);
        }

        return max;

    }
}