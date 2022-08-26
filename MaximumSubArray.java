//Time Complexity- O(n)
//Space Complexity - O(1)
//Sucessfully ran on leetcode
//Cadane's Algorithm

class Solution {
 public int maxSubArray(int[] nums) {
     if( nums == null || nums.length==0) return 0;
     
     int rSum = nums[0]; 
     int max = nums[0];
     int n = nums.length;
     
     for(int i = 1; i < n ; i++){
         
         rSum = Math.max( rSum + nums[i] , nums[i]);
         max= Math.max(max, rSum);
     }
     return max;
 }
}
