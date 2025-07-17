// TC: O(N)
// SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(rSum, max);
        }
        return max;
    }
}