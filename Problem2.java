// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
By calculating the current Sum and maximum sum we can get the max subarray
Cur sum is calculated by taking the maximum between the current element and the sum of prev elements so far
max sum is calculated by considering the maximun between the earlier maximum and current cur sum
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum += nums[i];
            if (nums[i] > curSum) {
                curSum = nums[i];
            }

            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }
        return maxSum;

    }
}
