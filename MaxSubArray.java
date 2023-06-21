//https://leetcode.com/problems/maximum-subarray
//TC : o(n)
//SC : o(1)


class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = Math.max(currSum+nums[i],nums[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
