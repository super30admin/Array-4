// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int rsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rsum = Math.max(nums[i], rsum + nums[i]);
            max = Math.max(rsum, max);
        }

        return max;
    }
}