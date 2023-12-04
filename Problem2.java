// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currsum += nums[i];
            currsum = Math.max(currsum,nums[i]);
            maxsum = Math.max(maxsum,currsum);
            
        }
        return maxsum;
    }
}