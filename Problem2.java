// Time Complexity : O(n) where n is the size of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int rSum = 0, max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i += 1) {
            rSum = Math.max(rSum+nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        
        return max;
    }
}