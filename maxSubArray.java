// Time: O(n)
//Space: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int n = nums.length;
        int max = nums[0];
        int rSum = nums[0];
        
        for(int i=1; i<n; i++){
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(rSum,max);
        }
        
        return max;
    }
}