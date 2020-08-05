// Time Complexity :  O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


//https://leetcode.com/problems/array-partition-i/submissions/
class Solution {
    
    //nlogn solution by sorting array and summing up even indexed numbers
    //sorting ensures, numbers with minimum difference are paired together (in other words, larger numbers paried together)
    public int arrayPairSum(int[] nums) { 
       if(nums == null || nums.length == 0) return 0;
        
       int res = 0;
       Arrays.sort(nums);
       for(int i =0; i < nums.length; i=i+2) {
           res+=nums[i];
       }
       
       return res;
        
    }
}