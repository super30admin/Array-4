// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        int currSum;
        int maxSubSum;
        
        currSum = maxSubSum = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            currSum = Math.max(num, currSum + num);
            maxSubSum = Math.max(maxSubSum, currSum);
        }
        
        return maxSubSum;
    }
}
