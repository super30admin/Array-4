class Solution {// time of O(n) and space of O(1)
    public int maxSubArray(int[] nums) {
        int numLen = nums.length ;
        // if there is no element or there is just one element
        int currSum = nums[0], maxSum = nums[0];
        
        for(int i=1 ; i<numLen ; i++){
            currSum = Math.max(currSum + nums[i], nums[i]) ; // Define the start
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}