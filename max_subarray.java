// Time Complexity : O(n) because we traverse the array once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We track the maximum subarray ending at the current index.
// For each element, we decide whether to start a new subarray or extend the existing one.
// The global maximum is updated whenever a larger subarray sum is found.

class Solution {
    public int maxSubArray(int[] nums) {

        int currSubArray = nums[0];
        int maxSubArray = nums[0];

        for(int i = 1; i < nums.length; i++) {

            // start new subarray or extend previous one
            currSubArray = Math.max(nums[i], currSubArray + nums[i]);

            // update global maximum
            maxSubArray = Math.max(currSubArray, maxSubArray);
        }

        return maxSubArray;
    }
}