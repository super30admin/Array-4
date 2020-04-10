// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : After class solution


// Your code here along with comments explaining your approach
//greedy approach

class Solution {
    public int maxSubArray(int[] nums) {
      
        //base check
        if(nums == null || nums.length == 0) return 0;
        
        int sum = 0;
        int totalSum = Integer.MIN_VALUE;
        
        for(int i=0; i< nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            totalSum = Math.max(totalSum, sum);
            System.out.println(sum + " " + totalSum);
        }
        
        return totalSum; 
    }
}