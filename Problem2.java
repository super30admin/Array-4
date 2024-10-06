Time:O(n)
Space:O(1)

class Solution {
    public int maxSubArray(int[] nums) 
    {
        int n = nums.length;
        int rsum = nums[0];
        int max = nums[0];
        for(int i=1;i<n;i++)
        {
            rsum = Math.max(nums[i],nums[i]+rsum);
            max = Math.max(rsum,max);
        }
        return max;
    }
}