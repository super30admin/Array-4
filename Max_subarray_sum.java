// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);

            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}