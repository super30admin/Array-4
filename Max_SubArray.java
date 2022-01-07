// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){return -99999;}
        
        int local_max = nums[0];
        int global_max = nums[0];
        //int max = 0;
        for(int i=1;i<nums.length;i++){
            local_max = Math.max(nums[i],nums[i]+local_max);
            if(local_max > global_max)
                global_max = local_max;
        }
        return global_max;
        
    }
}