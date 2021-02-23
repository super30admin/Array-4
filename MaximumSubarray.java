//Problem 123: Maximum Subarray
//TC:O(n^2)
//SC:O(1)

/*Steps
  Brute Force: TC: O(n^2) : Find sum for each element with other remaining elements 
  
*/

class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        
        int maxSum = Integer.MIN_VALUE;
        //TC:O(n^2) | SC:O(1)
        for(int i=0;i<nums.length;i++){
            int sum = nums[i];
            maxSum = Math.max(maxSum,sum);
            for(int j=i+1;j<nums.length;j++){
                sum += nums[j];
                maxSum = Math.max(maxSum,sum);
            }
        }
        
        return maxSum;
    }
}