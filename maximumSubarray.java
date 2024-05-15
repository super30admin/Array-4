// Time - O(n)
// Space - O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums==null || nums.length == 0)
            return 0;
        
        int max=nums[0];
        int rSum=nums[0];
        int start=0, start_f=0,end=0;
        
        for(int i=1;i<nums.length;i++)
        {
            rSum=Math.max(nums[i],rSum+nums[i]);
            
            if(rSum<=nums[i])
                start=i;
            
            if(max<rSum)
            {
                start_f=start;
                end=i;
            }
            max=Math.max(max,rSum);
        }
        
        System.out.println(start_f+" "+end);

        return max;
    }
}