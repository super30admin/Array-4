// Time Complexity : O(N) - As we iterate the whole array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int result = 0;
        int currsum = nums[0];
        int maxsum = nums[0];
        for(int i = 1;i < nums.length;i++){
            currsum = Math.max(nums[i],currsum + nums[i]);
            maxsum = Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}
// Your code here along with comments explaining your approach