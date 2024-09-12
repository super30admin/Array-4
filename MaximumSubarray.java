/*

Brute force approach every number with every other number in combination till we get the maximum sum .
Here time will be O(n^2)

Approach:
Step1: We choose first element or dont choose and get the max of the two. 
Step2: Then set the  local sum .
Step3: Compare with the global sum 
Executed on leetcode
*/
class Solution {
    public int maxSubArray(int[] nums) {
        //edge
        if(nums == null || nums.length == 0) return 0;
        int localSum = nums[0]; int globalSum = nums[0];
        
        for(int i =1 ; i < nums.length; i++){
            localSum = Math.max(nums[i],localSum+nums[i]);
            globalSum = Math.max(localSum,globalSum);
        }
      return  globalSum;
    }
}

/*
Time complexity : O(n)
Space complexity : O(1)
*/


/*
Follow up question find the range of the subarray with maximum sum
Approach whenever we find the rSum ie local sum is alone greater than the previous sum then reset local sum to new number when alone.
k is start index of my the current sub array 
*/

class Solution {
    public int maxSubArray(int[] nums) {
     if(nums ==null || nums.length == 0) return 0;
     int start = 0; int end = 0;
     int globalMaxSum = nums[0]; int k = 0; 
        
     int rSum = nums[0]; //local sum
     
     for(int i = 1 ; i < nums.length; i++){
          rSum+= nums[i];
         if(nums[i] > rSum ){ //leave it alone it better sum when alone
             k = i;   // 3 pointers for the recording start ie. start,k ,i
             rSum = nums[i]; //reset rSum
         }
         
         if(rSum >globalMaxSum){
             start = k;
             end = i;
             globalMaxSum = rSum; //reset global Sum 
         }
       }   
       System.out.println("start index "+start);
       System.out.println("end index "+end);
     return globalMaxSum;
    }
}

/*
TimeComplexity : O(n)
SpaceComplexity: O(1)
*/
