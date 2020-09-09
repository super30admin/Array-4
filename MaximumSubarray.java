//TC: O(n)
//SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0]; int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            rSum = Math.max(rSum+nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}

