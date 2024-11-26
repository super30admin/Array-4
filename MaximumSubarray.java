// Time complexity: O(n)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxSubArray(int[] nums) {
        // return 0 if input array is empty or null
        if(nums == null || nums.length == 0) return 0;
        // initialize max and runningSum
        int max = nums[0];
        int runningSum = nums[0];
        // iterate through the array
        for(int i = 1; i < nums.length; i++){
            // update runningSum, maximum between the element at i and its sum with the previous running sum
            runningSum = Math.max(nums[i], nums[i] + runningSum);
            // if the current running sum is greater than max sum, update the max sum
            max = Math.max(max, runningSum);
        }
        return max;
    }
}