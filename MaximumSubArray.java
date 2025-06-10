// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];   // global max
        int currentMax = nums[0]; // local max

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
