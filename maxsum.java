class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 0 || nums == null)
            return 0;
        int max_sum = nums[0];
        int sum_including_current = nums[0];
        for(int i=1;i<nums.length;i++){
            sum_including_current = Math.max(nums[i],nums[i] + sum_including_current);
            max_sum = Math.max(sum_including_current,max_sum);
        }
        return max_sum;
    }
}
