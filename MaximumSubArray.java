// // Time complexity - O(n)
// Space complexity -O(1)
//Solved on leetcode - yes
//FAced any issues - NO
// Calculate the running sum considering the max of current element and sum of previous running sum and current element
class Solution {
    public int maxSubArray(int[] nums) {
        int rSum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            rSum = Math.max(rSum+nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}
