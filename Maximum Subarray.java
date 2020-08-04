// Time Complexity : O(n^3)
// Space Complexity :O(1)

<-----Brute Force----->
class Solution {
  public int maxContiguousSubarraySum(int[] nums) {
    int n = nums.length;
    int maximumSubArraySum = Integer.MIN_VALUE;
    
    for (int left = 0; left < n; left++) {
      for (int right = left; right < n; right++) {        
        int windowSum = 0;
        
        for (int k = left; k <= right; k++) {
          windowSum += nums[k];
        }        
        maximumSubArraySum = Math.max(maximumSubArraySum, windowSum);
      }
    }
    return maximumSubArraySum;
  }
}

// Time Complexity : O(n^2)
// Space Complexity :O(1)
class Solution {
  public int maxContiguousSubarraySum(int[] nums) {
    int n = nums.length;
    int maximumSubArraySum = Integer.MIN_VALUE;

    for (int left = 0; left < n; left++) {
      int runningWindowSum = 0;

      for (int right = left; right < n; right++) {
        runningWindowSum += nums[right];
        
        maximumSubArraySum = Math.max(maximumSubArraySum, runningWindowSum);
      }
    }
    return maximumSubArraySum;
  }
}

// Time Complexity : O(n)
// Space Complexity :O(1)

class Solution {
    public static int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;
        
        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++){            
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);            
            maxSoFar = Math.max(maxSoFar, maxEndingHere);	
        }
     return maxSoFar;
    }
}