// Time Complexity :O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(currSum<0){
                currSum = 0;
            }
            
            currSum += nums[i];
            sum = Math.max(currSum, sum);
        }
        return sum;
    }
}