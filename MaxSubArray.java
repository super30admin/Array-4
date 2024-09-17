class Solution {
  
    /*
      Time : O(N)
      Space : O(1)
    */
    
    // Approach
    // 1. For each element check, if we add that element into currSum then will it be max or not, if it will be max then add it or start subarray from curr position
   // 2. Check if curr is better than max if so update max.
  
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int max = nums[0];
        int curr = nums[0];
        
        for(int i  = 1 ; i < n ; i++){
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(curr, max);
        }
        
        return max;
    }
  
  // If we are ask to provide start and end indices
  public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int max = nums[0];
        int curr = nums[0];
        
        int start = 0; int end = 0;
        int k = 0;
        
        for(int i  = 1 ; i < n ; i++){
            curr = nums[i] + curr;
            if(curr < nums[i]){
                curr = nums[i];
                k = i;
            }
            
            if(curr > max){
                max = curr;
                start = k;
                end = i;
            }
            
        }
        
        System.out.println(start + " " + end);
        return max;
    }
}
