// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : We maintain currSum at each index and capture the maximum of it. The currSum will be maximum of current index value or the pre computed sum until
// that index. This way we are eliminating the lower value as we need to return the maximum only.

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum+nums[i]); //update the start point of considering max sum sub array
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}