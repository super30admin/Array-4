/*
algorithm:
at each iteration, take currSum
as numbers can also be negative, we take currSum as max between previous
calculated currsum and nums[i]+currsum
then update the maxSum
time complexity: O(n)
space complexity :O(1)

*/

class Solution {
    public int maxSubArray(int[] nums) 
    {
        //base case
        if(nums.length == 0 || nums == null)return 0;
        
        int maxSum = nums[0];
        int currSum = nums[0];
        
        int start = 0;
        int end = 0;
        int startLocal = 0;
        for(int i = 1;i < nums.length;i++){
            // currSum = Math.max(nums[i],currSum+nums[i]);
            // maxSum = Math.max(maxSum, currSum);
            
            //to print the indices of the max subarray
            currSum = currSum + nums[i];
            if(currSum  < nums[i]){
                currSum = nums[i];
                startLocal = i;
            }
            if(maxSum < currSum){
                maxSum = currSum;
                start = startLocal;
                end = i;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return maxSum;
        
    }
}