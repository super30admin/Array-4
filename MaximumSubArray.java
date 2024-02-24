public class MaximumSubArray {
    // TC: O(N) where N is length of array
    // SC: O(1)
    public int maxSubArray(int[] nums) {
        int currMax = nums[0], res = nums[0];
        int start = 0, end = 0, currStart = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currMax + nums[i]) {
                currStart = i;
                currMax = nums[i];
            } else {
                currMax = currMax + nums[i];
            }
            if (currMax > res) {
                res = currMax;
                start = currStart;
                end = i;
            }
        }
        return res;
    }
}
