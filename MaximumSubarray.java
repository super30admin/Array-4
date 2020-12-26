// Time Complexity :  O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode :Yes

class Solution {
    public int maxSubArray(int[] nums) {
        int finalSum = nums[0];
        int sumnow = 0;
        for(int i = 0; i < nums.length; i++){
            sumnow = Math.max(nums[i] + sumnow, nums[i]);
            finalSum = Math.max(sumnow, finalSum);
        }
        return finalSum;
    }
}