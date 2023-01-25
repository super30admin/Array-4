// Maximum Subarray

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int result = nums[0];
        int currSum = nums[0];

        for(int i = 1; i < n; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            result = Math.max(result, currSum);
        }
        return result;
    }
}