// Time Complexity : O(n) n -> no of integers
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: The main idea is to determine whether to include the current number or exclude it and start from next number.
// Since we need to find maximum subarray, the selection needs to be continuous. Runningsum can be calculated at each index and if it is observed that including the current index will make the sum smaller, then it will not be included. 

class Solution {
    public int maxSubArray(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0]; // to capture the maximum subarray sum
        int runningSum = nums[0]; // to capture the runningsum at each index
        for(int i = 1; i < nums.length; i++) {
            runningSum = Math.max(runningSum+nums[i], nums[i]);
            max = Math.max(runningSum, max);
        }
        return max;
    }
}
