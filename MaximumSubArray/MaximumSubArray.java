/* Time Complexity : O(n)) 
 *  n - len of array - nums */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :


class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];
        int n = nums.length;

        for(int i = 1; i < n; i++){
            currSum = Math.max(currSum+nums[i], nums[i]);
            max = Math.max(max, currSum);
        }
        return max;
    }
}