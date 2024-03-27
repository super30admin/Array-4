class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length;

        // Initialize current sum and maximum sum to the first number in the array
        int currSum = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            max = Math.max(max, currSum);
        }

        return max;
    }

}