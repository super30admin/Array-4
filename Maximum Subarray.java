class Solution {
    public int maxSubArray(int[] nums) {
        
        int runningSum = 0;
        int largest_size = 0;
        int size = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i  < nums.length; i++){
            
            runningSum = runningSum + nums[i];  
            
            
            
            runningSum = Math.max(nums[i], runningSum);
            maxSum = Math.max(runningSum, maxSum);
            largest_size = Math.max(largest_size, size);
            
        }
        
        return maxSum;
    }
}