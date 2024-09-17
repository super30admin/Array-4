class Solution{

  // Find the running sum of elements 
  // see whats the max Sum -> Math.max(maxSum , currSum)
  // currSum < 0 ? currSum =0 : do nothing
  public int maxSubArray(int[] nums)
  {
  
    int maxSum  = Integer.MIN_VALUE;
    int currSum = 0;
    
    for(int i = 0 ; i < nums.length ; i++)
    {
        
      currSum = currSum + nums[i];
      
      maxSum = Math.max(currSum , maxSum);
      
      if(currSum < 0)
      {
        currSum = 0;
      }
    }
      return maxSum;
  
  }


}
