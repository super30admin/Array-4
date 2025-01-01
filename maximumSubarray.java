// Time complexity = O(n)
// Space complexity = O(1)

class Solution {
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    if(nums == null || nums.length == 0) return 0;
    int maxSum = nums[0];
    int currentSum = nums[0];
    // Running sum
    for(int i = 1; i<n; i++) {
      currentSum = Math.max(nums[i], currentSum+nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }
}