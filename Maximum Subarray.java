// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null ||nums.length==0)
            return 0;
        int max = nums[0];
        int rsum = nums[0];
        for(int i = 1; i<nums.length;i++){
            rsum = Math.max(rsum+nums[i],nums[i]);
            max = Math.max(max,rsum);
        }
        return max;
    }
}