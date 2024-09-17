//Time complexity : O(n);
//Space Complexity : O(1);
//Leetcode : Passed all test cases

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i<nums.length;i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        
        return maxSum;
    }
}