// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    1. Keep looping the array and if the current numbe ris greater than the sum of the previous subarray, then use the current number as the start of the new subarray.
    2. Maintain the max sum of the subarray.
*/

// Your code here along with comments explaining your approach
class Solution {
    public int maxSubArray(int[] nums) {
        int sumTillIndex = nums[0];
        int largestSum = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(!(nums[i] + sumTillIndex > nums[i]))
                sumTillIndex = nums[i];
            else 
                sumTillIndex += nums[i];
            largestSum = Math.max(sumTillIndex, largestSum);
        }
        return largestSum;
    }
}
