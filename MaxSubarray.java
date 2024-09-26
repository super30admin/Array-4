//T.C = O(n)
//s.c =o(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        
        int rsum = nums[0];
        int max = nums[0];
        
        for(int i=1;i<nums.length ;i ++)
        {
            rsum = Math.max(nums[i],rsum+nums[i]);
            max = Math.max(max,rsum);
        }
        
       
        return max;
    }
}