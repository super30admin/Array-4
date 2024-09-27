// Time Complexity : O(n) where n is the length of the array nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class maxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int currSum = nums[0];
        int max = currSum;
        for (int i = 1; i < n; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            max = Math.max(max, currSum);
        }
        return max;
    }
}