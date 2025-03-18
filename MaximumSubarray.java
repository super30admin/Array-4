/*
 * TC: O(n)
 * SC: O(1)
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        if (l == 1) return nums[0];
        int i;
        int currSum = nums[0];
        int maxSum = nums[0];

        for(i = 1; i < l; i++) {
            // if the current sum is negative, better to discard it
            if (currSum < 0) currSum = 0;
            currSum += nums[i];
            // now set the max sum found
            if (maxSum < currSum) maxSum = currSum;
        }
        return maxSum;
    }
}
