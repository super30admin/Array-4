class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > 0){
                nums[i] = nums[i-1] + nums[i];
            }
            if(maxSum < nums[i]){
                maxSum = nums[i];
            }
        }
        return maxSum;
    }
}