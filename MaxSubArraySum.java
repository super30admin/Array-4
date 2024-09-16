// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Nope.


// Your code here along with comments explaining your approach

class MaxSubArraySum {
    public int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0], maxSoFar = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
    return maxSoFar;
    }
}