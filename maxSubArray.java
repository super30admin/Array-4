
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum =0 ,maxSum =nums[0];
        
        for(int num : nums){
            currentSum += num;
            maxSum = Math.max(maxSum,currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}