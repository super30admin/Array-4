// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
 * 1. Iterate through the array, keep track of the current sum and the max sum.
 * 2. Compare current sum + incoming element and incoming element, whichever is greater, assign it to current sum.
 * 3. Compare current sum and max sum, whichever is greater, assign it to max sum.
 * 4. Return max sum.
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0], currSum = nums[0];

        for(int i=1; i<n; i++){
            if(currSum + nums[i] < nums[i])
                currSum = nums[i];
            else 
                currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}