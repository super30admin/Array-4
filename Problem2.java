
// Time Complexity : O(n)
// Space Complexity : O(1)

// The question is to find the contiguous subarray with the largest sum within a given one-dimensional array of numbers.

// We maintain two variables: currSum to keep track of the current subarray sum and maxSum to store the maximum sum found so far.
// We iterate through the array, updating currSum by adding the current element or starting a new subarray with the current element if currSum becomes negative.
// We also update maxSum whenever currSum exceeds it.


class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=nums[0],maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}