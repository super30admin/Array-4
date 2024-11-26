/*
Problem: https://leetcode.com/problems/maximum-subarray/
TC: O(n)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0];
        int maxSum = nums[0];
        int curStart = 0, start = 0, end = 0;
        
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > rSum + nums[i]) {
                rSum = nums[i];
                curStart = i;
            } else {
                rSum = rSum + nums[i];
            }
            
            if (rSum > maxSum) {
                maxSum = rSum;
                start = curStart;
                end = i;
            }
        }
        
        System.out.println("Max subarray start: " + start + ", end: " + end);
        return maxSum;
    }
}