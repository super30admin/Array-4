class ArrayPartition{
  /**
   * https://leetcode.com/problems/array-partition-i/
   * 
   * Time Complexity: O(n logn)
   * 
   * Space complexity: O(1)
   * 
   * Were you able to solve this on leetcode? Yes
   */

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    
    int maxSum = 0;
    
    for(int i = 0; i < nums.length-1; ){
        maxSum += Math.min(nums[i], nums[i+1]);
        i += 2;
    }
    
    return maxSum;
  }
}
