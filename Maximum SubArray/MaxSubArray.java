/**
 * Time Complexity: O(n)
 * Space COmplexity: O(1)
 * Leetcode : Yes
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            
            if(currSum < 0) currSum = 0;
            max = Math.max(max, currSum);
        }
        
        if(max == 0) {
            int negMax = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i] > negMax)
                    negMax = nums[i];
            }
            return negMax;
        }
        
        return max;
    }
}