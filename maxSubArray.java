// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


public class Solution {
    public int maxSubArray(int[] nums) {

        if(nums == null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int local = 0;
        int global = Integer.MIN_VALUE;
        for(int num:nums)
        {
            local = Math.max(local+num,num);
            if(local>global) global = local;
        }
        return global;
    }
}