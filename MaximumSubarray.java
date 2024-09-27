//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int Rsum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            Rsum = Math.max(nums[i], Rsum + nums[i]);
            max = Math.max(max, Rsum);
        }

        return max;

    }
}