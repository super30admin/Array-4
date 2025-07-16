// Time complexity: O(n) for the loop
// Space complexity: O(1) for the running sum and max sum variables

// Intuition: Iterate through the array, maintaining a running sum of the current subarray.
// If the running sum becomes negative, reset it to zero. Keep track of the maximum sum encountered.

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int runningSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            runningSum += num;
            maxSum = Math.max(maxSum, runningSum);
            if (runningSum < 0) { // Reset the running sum if it goes negative -- 5, -10, 8
                runningSum = 0;
            }
        }

        return maxSum;
    }
}

// Follow-up: what the the indexes of the maximum subarray?
// We can modify the above code to keep track of the start and end indices of
// the maximum subarray
// while iterating through the array. Here's how you can do it:

// where the maximum subarray starts and ends at startM and endM as the global
// maximum variables
// the local maxima are // the startR and i respectively
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int rSum = 0;
        int startR = 0;
        int startM = 0, endM = 0;
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (rSum < nums[i]) {
                startR = i;
                rSum = nums[i];
            }

            if (maxSum < rSum) {
                maxSum = rSum;
                startM = startR;
                endM = i;
            }

        }

        System.out.print(startM + " " + endM);

        return maxSum;
    }
}
