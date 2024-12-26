// Time Complexity  - O(n) as array is traversed only once
// Space Complexity - O(1) Constant space

public class MaxSubArrayIndices {
    public int[] maxSubArray(int[] nums) {
        // Initialize variables
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            // Choose the larger value: extend the current subarray or start a new one
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
                tempStart = i; // Set temp start as the current index
            } else {
                currentSum += nums[i];
            }

            // Update the global maximum
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i; // Update the end index
            }
        }

    // Return the start and end indices along with the maximum sum
        return new int[]{maxSum, start, end};
    }

    public static void main(String[] args) {
        MaxSubArrayIndices solution = new MaxSubArrayIndices();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = solution.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result[0]);  // Output: 6
        System.out.println("Start Index: " + result[1]);           // Output: 3
        System.out.println("End Index: " + result[2]);             // Output: 6
    }
}

