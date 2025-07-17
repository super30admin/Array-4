class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}
