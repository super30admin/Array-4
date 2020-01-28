/**
LeetCode Submitted : YES
Space Complexity : O(1)
Time Complexity : O(N)


The idea is to use max sum and currsum till now. Also, if we encounter current sum < 0 reset to zero. At last return maxSum. This algorithm is Kadane's Algorithm.

**/
class Solution {
    public int maxSubArray(int[] nums) {
     
        if(nums == null || nums.length < 1)
            return 0;
        
        int maxSum  = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i = 0;i<nums.length;i++){
            currSum += nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                    currSum = 0;
            }
        }
        
        return maxSum;
    }
}
