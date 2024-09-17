package Array-4;

public class MaximumSubArray {
    Time Complexity : O(n^2)
    Space Complexity : O(1)
    
    public int maxSubArray(int[] nums) {
           
           int sum;
           int maxSum = Integer.MIN_VALUE;
           
          for(int i=0;i<nums.length;i++)
          {
              sum  = 0;
              for(int j=i;j<nums.length;j++)
              {
                 sum+=nums[j];
                 maxSum = Math.max(maxSum,sum);
              }
          }
           
           return maxSum;
           
       } 
       
       */      
       
    // Optimized Approach DP  
   /* 
       Time Complexity : O(n)
       Space Complexity : O(n)
          
       public int maxSubArray(int[] nums) {
           int n = nums.length;
           int [] dp = new int[n]; 
           dp[0] = nums[0];
           int maxSum = nums[0];
           for(int i=1;i<n;i++)
           {
              dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);    
              maxSum = Math.max(maxSum,dp[i]); 
           }
           
           return maxSum;
       }
       
    */ 
       
     // Optimized DP in terms of Space  
     /*
     Time Complexity : O(n)
     Space Complexity : O(1)
     */  
       public int maxSubArray(int[] nums) {
           
           int n = nums.length; 
           int currSum = nums[0];
           int maxSum = nums[0];
           for(int i=1;i<n;i++)
           {
              currSum = Math.max(nums[i],currSum+nums[i]);    
              maxSum = Math.max(maxSum,currSum); 
           }
           
           return maxSum;
       }    
}
