//Time complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int curr_sum= nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            curr_sum= Math.max(nums[i], nums[i]+curr_sum);
            if(curr_sum>max_sum)
            {
                max_sum=curr_sum;
            }
          
        }
        return max_sum;
    }
}