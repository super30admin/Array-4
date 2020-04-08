// Divide and Conquer
// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :






// one pass

// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


class Solution {
    public int maxSubArray(int[] nums) {
        int currmax=nums[0];
        int globalmax=nums[0];
        for(int i=1;i<nums.length;i++){
            currmax=Math.max(nums[i],currmax+nums[i]);
            globalmax=Math.max(currmax,globalmax);
        }
        return globalmax;
    }
}