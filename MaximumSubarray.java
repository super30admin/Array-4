// 0(n)
//0(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length ==0 || nums==null)
        {
            return 0;
        }
        int best=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            best=Math.max(nums[i],nums[i]+best);
            result=Math.max(best,result);
        }
        return result;

    }
}