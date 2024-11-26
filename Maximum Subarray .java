class Solution {
    public int maxSubArray(int[] nums) {

        int currsum = nums[0] , max = nums[0];

        for(int i=1 ; i<nums.length ; i++)
        {
            currsum = Math.max(nums[i] , nums[i]+currsum);
            max= Math.max(max ,  currsum );
        }

        return max;
    }
}
