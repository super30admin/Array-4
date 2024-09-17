//Problem 123: Maximum Subarray
//TC:O(n)
//SC:O(1)

/*Steps
  Brute Force: TC: O(n^2) : Find sum for each element with other remaining elements 
  Optimised : Take two variables, that are current and max, where current is running sum which is max of either curr+incoming element or the incomming element 
  Eg: : -2,1,-3,4,-1,2,1,-5,4
         curr    maxSum
         -2       -2
          1        1
          4        4
          3        4
          5        5
          6        6
          1        6
          5        6
*/

//Optimized
class Solution123 {
 public int maxSubArray(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        //TC:O(N)| SC:O(1)
        //Take two variables, that are current and max
        int curr    = nums[0];
        int maxSum  = nums[0];
        
        for(int i=1;i<nums.length;i++){
            curr    = Math.max(curr+nums[i],nums[i]);
            maxSum  = Math.max(maxSum,curr);
        }
        
        return maxSum;
    }
} 


//Solution if asked return the max sum array
/*
class Solution {

    public int maxSubArray(int[] nums) {
        
        if(nums==null || nums.length==0) return 0;
        //TC:O(N)| SC:O(1)
        //Take two variables, that are current and max
        int curr    = nums[0];
        int maxSum  = nums[0];
        //if u have to find the array of maxsum
        int start =0;
        int end   =0;
        int k=0;//because this will be resetted again and again when curr is greater than the earlier curr
        for(int i=1;i<nums.length;i++){
            curr = curr+nums[i];
            if(curr<nums[i]){
                curr = nums[i];
                k = i;
            }
            
            if(maxSum<curr){
                maxSum = curr;
                start = k;
                end   = i;
            }
            
        }
        //System.out.println(start);
        //System.out.println(end);
        return maxSum;
    }
} 

*/

//Brute Force
/*class Solution {
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
}*/