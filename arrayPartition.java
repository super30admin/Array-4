// Time complexity = O(nlogn)
// Space complexity = O(1)

class Solution {
  public int arrayPairSum(int[] nums) {
    int n = nums.length;
    if(nums == null || n == 0) return 0;
    int result = 0;
    Arrays.sort(nums);
    for(int i = 0; i<n; i = i+2) {
      result += nums[i];
    }
    return result;
  }
}