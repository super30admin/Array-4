import java.util.Arrays;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
//        TC:O(n)
//        SC:O(1)
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public int maxSubArrayWithRunningSum(int[] nums) {
//        TC:O(n)
//        SC:O(1)
        int runningSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            maxSum = Math.max(maxSum, runningSum);

            // If runningSum becomes negative, reset it to 0
            if (runningSum < 0) {
                runningSum = 0;
            }
        }

        return maxSum;
    }
    public int[] maxSubArrayWithRunningSum1(int[] nums) {
        int runningSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            if (runningSum > maxSum) {
                maxSum = runningSum;
                start = currentStart;
                end = i;
            }

            if (runningSum < 0) {
                runningSum = 0;
                currentStart = i + 1;
            }
        }

        // Return the subarray
        return Arrays.copyOfRange(nums, start, end + 1);
    }
}
