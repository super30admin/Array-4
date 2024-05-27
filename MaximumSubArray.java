class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currSum = nums[0];
        int start =0;
        int end =0;

        for(int i=1; i<n; i++)
        {
            currSum += nums[i];
            if(currSum <nums[i])
            {
                 currSum = nums[i];
                 start =i;
                 end =i;
            }
            if(currSum >max)
            {
                max = currSum;
                end =i;
            }
        }
        return max;
    }
}

