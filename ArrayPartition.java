import java.util.Arrays;

//Time complexity- O(n log n)
//Space Complexity- O(1)
//Sucessfully ran on leetcode

class Solution {
 public int arrayPairSum(int[] nums) {
     if(nums == null || nums.length==0) return 0;
     
     int sum=0;
     Arrays.sort(nums);
     for(int i=0; i< nums.length; i= i+2){
         
         sum = sum + nums[i];
     }
     return sum;
 }
}