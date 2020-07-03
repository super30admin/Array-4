//https://leetcode.com/problems/maximum-subarray/
//time o(n)
//space o(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            sum = Math.max(sum, nums[i]);
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}