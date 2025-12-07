/**
 * LeetCode: MaxSumArray
 * Url: https://leetcode.com/problems/maximum-subarray/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int maxsum = new MaxSubArray().maxSubArray(new int[] { -1, -1, -2, -1, -1, -1, 1, -1, 1, 2 });
        System.out.println(maxsum);
    }
}
