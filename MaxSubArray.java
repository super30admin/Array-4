// Time complexity : O(n)
// Space Complexity : O(1)

/**
	•	Finds the maximum sum of a contiguous subarray using Kadane’s Algorithm.
	•	Iterates through the array while maintaining the current and maximum sum.
	•	Runs in linear time with constant space usage.
*/

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; 
        int currentSum = nums[0]; 

        for(int i = 1 ; i < nums.length ; i++) {
            currentSum = Math.max(currentSum+nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;  
    }
} 
