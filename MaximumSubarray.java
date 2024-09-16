// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        int maxTillNow = nums[0];
        int maxHere = nums[0];

        if(nums.length == 1) {
            return nums[0];
        }
        for(int i = 1; i < nums.length; i++) {
            maxHere = Math.max(nums[i], nums[i] + maxHere);
            if(maxTillNow < maxHere) {
                maxTillNow = maxHere;
            }
        }
        return maxTillNow;
    }
}