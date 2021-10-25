//Time complexity: O(N)
//Space complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int rSum = nums[0];
        int max = nums[0];
        for(int i = 1;i < nums.length; i++) {
            rSum = Math.max(nums[i], rSum + nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}