class Solution {
    
    // Time Complexity: O(n)    (where n -> number of elements in nums array)
    // Space Complexity: O(1)
    
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        int sum = nums[0];
        int maxSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            if(nums[i] > sum)
                sum = nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}