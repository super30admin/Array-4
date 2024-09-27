// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for(int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], nums[i] + maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
