//TC : O(N)
//SC : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0) return 0;

        int max = nums[0];
        int rSum = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            rSum = Math.max(nums[i],nums[i]+rSum);
            max = Math.max(max,rSum);
        }

        return max;
    }
}