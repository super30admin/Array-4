// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
class Solution {
    public int maxSubArray(int[] nums) {
        //base
        if(nums==null || nums.length==0) return 0;
        // int [] dp = new int[nums.length];
        
        // dp[0] = nums[0];
        int localMax = nums[0];
        // int max=nums[0];
        int globalmax = nums[0];
        for(int i=1;i<nums.length;i++){
            if(localMax>0){
                localMax=nums[i]+localMax;
            }
            else{
                localMax = nums[i];
            }
            globalmax = Math.max(globalmax,localMax);
        }
        return globalmax;
        }
    }
