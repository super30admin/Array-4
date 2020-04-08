// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approachclass Solution {
class Solution {
    public int maxSubArray(int[] nums) {
        //base
        if(nums==null || nums.length==0) return 0;
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        int max=nums[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i-1]>0){
                dp[i]=nums[i]+dp[i-1];
            }
            else{
                dp[i] = nums[i];
            }
            max = Math.max(max,dp[i]);
        }
        return max;
        }
    }
