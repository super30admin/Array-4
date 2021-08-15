// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            res = Math.max(res, nums[i]);
        }
        
        return res;
    }
}