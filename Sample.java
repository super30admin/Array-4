//Time Complexity:O(nlogn)
//Space Complexity:O(1)
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
-------------------------------------------------------------------------------------
//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int currSum = nums[0], maxSum = nums[0];

    for(int i = 1; i < n; ++i) {
      currSum = Math.max(nums[i], currSum + nums[i]);
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }
}
------------------------------------------------------------------------
//Time Complexity:O(n)
//Space Complexity:O(1)
