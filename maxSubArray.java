// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Take a curr and a max variable. Initially both will be nums[0]. From 1 to n,
 * at each index, add that number to curr and see if it is greater than the
 * curr, if not make that number as curr. Then take the max of max and curr to
 * get the updated max value. return max at the end.
 *
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int currSum = nums[0];
        int max = nums[0];
        
        for(int i=1;i<n;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            max = Math.max(max, currSum);
        
        }
        return max;
    }
}
