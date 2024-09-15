// Time Complexity : O(n), Array is traversed once.
// Space Complexity : O(1), no extra space is used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        int rsum = nums[0];
        int max= nums[0];
        for(int i=1;i<nums.length;i++){
            rsum = Math.max(rsum+nums[i],nums[i]);
            max = Math.max(rsum,max);
        }
        return max;
    }
}
