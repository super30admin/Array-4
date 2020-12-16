//Time complexity:O(n)
//space complexity:O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int max=nums[0];
        int sum=nums[0];
        int start=0;int end=0; int currentStart=0;
        for(int i=1;i<nums.length;i++)
        { 
            if(nums[i]>sum+nums[i])
            {
                currentStart=i;
                sum=nums[i];
            }
            else
            {
                sum+=nums[i];
            }
            if(sum>max)
            {
                start=currentStart;
                end=i;
                max=sum;
            }
            System.out.println(start);
            System.out.println(end);
        }
        //sum+=min;
        return max;
    }
}
