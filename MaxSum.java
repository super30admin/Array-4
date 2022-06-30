// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int runnSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // add current number to runningSum
            runnSum += nums[i];
            // if current number is greater than runningSum, start runningsum from curr
            // number
            if (runnSum < nums[i]) {
                runnSum = nums[i];
            }
            // store maximum in result
            currSum = Math.max(currSum, runnSum);
        }
        return currSum;
    }
}