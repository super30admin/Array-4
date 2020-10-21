// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        
        int currsum =nums[0];
        int maxsum =nums[0];
        for(int i=1; i<nums.length; i++){
            currsum = Math.max(nums[i], nums[i] + currsum);
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
        
    }
}
