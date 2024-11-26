// Time complexity: O(n)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxSubArray(int[] nums) {
        int rsum = nums[0];int max = nums[0];
       for(int i=1;i<nums.length;i++){
           rsum = Math.max(rsum+nums[i],nums[i]);
           max = Math.max(max,rsum);
        } 
        return max;
    }
}
