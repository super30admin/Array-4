//  Time Complexity: O(n)
//  Space Complexity: O(1)

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int rSum = nums[0];

        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (rSum + nums[i] < nums[i]) {
                currentStart = i;
                rSum = nums[i];
            }
            else {
                rSum = rSum + nums[i];
            }

            if (rSum > max) {
                start = currentStart;
                end = i;
                max = rSum;
            }
        }

        System.out.print("Maximum Subarray: ");
        for (int i = start; i <= end; ++i) {
            System.out.print(nums[i] + " ");
        }

        return max;
    }
}
