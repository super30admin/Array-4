// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
I maintain two variables - currSum and maxSum and initialize them both to nums[0]. I begin iterating from the first element of the array to the last element. I update currSum as the maximum of 
currSum + element at current i index or the element at i index itself(If current element is greater than the sum so far, we discard the previous sum and start a new sum from the current element). 
I then update the maxSum as maximum of maxSum and currSum to store the maximum sum we have seen so far in the subarray.
*/

public class Solution
{
    public int MaxSubArray(int[] nums)
    {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.Length; i++)
        {
            currSum = Math.Max(currSum + nums[i], nums[i]);
            maxSum = Math.Max(maxSum, currSum);
        }

        return maxSum;
    }
}