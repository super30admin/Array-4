// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class MaximumSubarray_KadanesAlgo {
    public int maxSubArray(int[] nums) {

        int currSum = 0, maxSum = nums[0];

        for (int i : nums) {
            currSum += i;
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) currSum = 0;
        }
        
        return maxSum;
    }
}