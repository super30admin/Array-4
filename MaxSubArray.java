public class MaxSubArray {
    
    /**
     * Time Complexity: O(N) N is size of array
     * Space complexity: O(1)
     * 
     * Approach:
     * 1. Maintain the running sum anc check if running sum is greater than current value or not
     * 2. Return the maximum running sum.
     */

        public int maxSubArray(int[] nums) {
            
            if(nums == null || nums.length == 0)
                return 0;
            
            int maxSum = Integer.MIN_VALUE;
            int runningSum = 0;
            
            for(int n: nums) {
                runningSum = Math.max(runningSum + n, n);
                maxSum = Math.max(maxSum, runningSum);
            }
            
            return maxSum;
            
        }
    
}