// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
We iterate through the input array to identify current sum at each level by taking maximum value between the
incoming input and sum of running current sum added along with the current value. Later we use the maximum value
between these two to check with the maximum sum accumulated at every step to make sure we are maximising the
sub array sum.
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1 ; i < nums.length ; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}