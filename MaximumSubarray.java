// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>0)
                nums[i] += nums[i-1];
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}