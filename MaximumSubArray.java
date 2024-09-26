//https://leetcode.com/problems/maximum-subarray/submissions/
// Time Complexity :O(n)  
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int rsum=nums[0],max=nums[0];
        for(int i=1;i<n;i++)
        {
            rsum=Math.max(rsum+nums[i],nums[i]);
            max=Math.max(max,rsum);
        }
        return max;
    }
}