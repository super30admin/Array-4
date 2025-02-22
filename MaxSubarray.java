// TC: O(n)
// sc: O(1)

class Solution {

  public int maxSubArray(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    for (int num : nums) {
      sum += num;
      if (sum > maxSum) maxSum = sum;
      if (sum < 0) sum = 0;
    }
    return maxSum;
  }
}
