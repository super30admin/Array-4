public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubArray = nums[0], maxSubArray = nums[0];

        for (int i = 1; i < n; i++) {
            currSubArray = Math.max(nums[i], currSubArray + nums[i]);
            maxSubArray = Math.max(currSubArray, maxSubArray);
        }

        return maxSubArray;
    }
}

//TC: O(N), SC: O(1)
