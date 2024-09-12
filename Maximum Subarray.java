// 53. Maximum Subarray
// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        int local = nums[0];
        int global = nums[0];
        for(int i=1; i< nums.length; i++)
        {
            local = Math.max(local + nums[i], nums[i]);
            global = Math.max(local, global);
        }
        
        return global;
    }
}