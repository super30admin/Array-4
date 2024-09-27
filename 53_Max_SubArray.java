    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/maximum-subarray/
    Time Complexity for operators : o(n) .. n is the length of the array
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 
        # Optimized approach: 
                              
            # 1. 
                    A) Traverse through the entire array
                    B) Do sum which will max of Math.max(sum + x, x);
                    C) Then, do max which is Math.max(max, sum);
                    D) At the end, return max.
    */  

class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int x : nums){
            sum = Math.max(sum + x, x);
            
            max = Math.max(max, sum);
        }
        
        return max;
    }
}