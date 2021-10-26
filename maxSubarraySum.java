// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach: Idea here is to use kadane's algorithm where we check if the running sum is a better answer
// for current index value or existing element at the index gives better answer to the problem
// with that value we continue to get better solution for continuing indexes in subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i< nums.length; i++) {
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}