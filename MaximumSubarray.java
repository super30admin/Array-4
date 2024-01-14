//TC : O(n)
//SC: O(1)
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

      int maxSum =nums[0];
      int currSum =0;

      for(int i=0; i< nums.length; i++){
        currSum=Math.max(nums[i], currSum+nums[i]);
        maxSum=Math.max(maxSum, currSum);
      }

      return maxSum;
    }
  }
