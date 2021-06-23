class Solution {
    //Time O(N)
    //Space O(1)
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        int R_Sum = nums[0] , max = nums[0];
        int start = 0 , end = 0 , curr = 0;
        for(int i=1 ; i<nums.length ; i++)
        {
            if(nums[i] + R_Sum > nums[i])
            {
                R_Sum = nums[i] + R_Sum;
            }
            else
            {
                R_Sum = nums[i];
                curr = i;
            }
            if(R_Sum > max)
            {
                max = R_Sum;
                start = curr;
                end = i;
            }
        }
        System.out.println(start + " " + end);
        return max;
    }
}