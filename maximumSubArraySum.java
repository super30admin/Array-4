/*
Time Complexity: O(n) Iterating over entire array
Space Complexity: O(1)//not using any extra space
*/
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length==0)
            return 0;
        
        int runningSum =0, maxSum =Integer.MIN_VALUE;
        //if running sum at any index is less than element at that index then discard the that sum and      start new  running sum from this index
        for(int i=0; i< nums.length; i++){
            runningSum += nums[i];
            if(runningSum < nums[i])
                runningSum= nums[i];
            //maintaining maxSum till now. 
            maxSum= Math.max(maxSum, runningSum);
        }
        return maxSum;
    }
}
