// TC: O(n)
// SC: O(1)

// Approach: Keep moving the subarray as you are finding positive sums
// and keep track of the max subarray sum. If at any point, the subarray sum
// is less than the element itself; update it and keep moving

class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int currentSum = nums[0];
        int currentStart = 0;

        int result = nums[0];
        int resStart = 0;
        int resEnd = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i] + currentSum) {
                currentSum = nums[i] + currentSum;
            } else {
                currentStart = i;
                currentSum = nums[i];
            }
            if (currentSum > result) {
                result = currentSum;
                resStart = currentStart;
                resEnd = i;
            }
        }

        System.out.println(resStart);
        System.out.println(resEnd);
        return result;
    }
}