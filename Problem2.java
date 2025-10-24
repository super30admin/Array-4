/*
53. Maximum Subarray
Ran on leetcode: Yes
TC: O(n)
SC: O(1)
Check if the current value or current value plus subarray is bigger and set current sum accordingly. Update max if current sum is greater than max.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int numsLen = nums.length;
        int currSum = nums[0];
        int max = nums[0];
        for(int i = 1; i < numsLen; i++){
            currSum = Math.max(nums[i], currSum + nums[i]); // check if current value is bigger or the current value subarray is bigger
            max = Math.max(max, currSum); // set the max of current sum and max
        }
        return max;
    }
}