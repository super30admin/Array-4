class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curSum = 0;

        for(int n : nums) {
            if (curSum < 0) curSum = 0;
            curSum += n;
            max = Math.max(curSum, max);
        }

        return max;
    }
}