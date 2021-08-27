// TC: O(n)
// SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int max, rSum;
        max = nums[0];
        rSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            rSum = Math.max(nums[i], rSum + nums[i]);
            max = Math.max(max, rSum);
        }

        return max;
    }
}