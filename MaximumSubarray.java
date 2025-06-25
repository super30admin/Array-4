// Time Complexity : O(n) n = total numbers in array
// Space Complexity : O(1), just few int variables used so constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach -
//   - Use Kadane’s Algorithm to keep track of the maximum subarray sum ending at each index.
//   - Maintain two variables: 'currSum' for the current subarray sum and 'maxSum' for the overall max.
//   - If 'currSum + nums[i]' is less than 'nums[i]', start a new subarray from index i.
//   - Track 'start', 'end', and 'currStr' to determine the indices of the maximum subarray if needed.
//   - Return 'maxSum' as the final result.

import java.util.Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];
        int start = 0, end = 0; //store indices of that max subarray
        int currStr = 0;
        for(int i = 1; i < n; i++) {
            if(nums[i] > currSum + nums[i]) {
                currStr = i;
            }

            currSum = Math.max(currSum + nums[i], nums[i]); //2 options - extending it or creating new subarray
            if(maxSum < currSum) {
                start = currStr;
                end = i;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        int[] input1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Input1: " + Arrays.toString(input1));
        System.out.println("Largest subarray sum: " + solution.maxSubArray(input1));

        int[] input2 = new int[]{5,4,-1,7,8};
        System.out.println("Input2: " + Arrays.toString(input2));
        System.out.println("Largest subarray sum: " + solution.maxSubArray(input2));
    }
}
