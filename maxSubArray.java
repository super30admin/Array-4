//Time complexity: O(N)
//Space complexity: O(1)


//Approach: running sum pattern

class maximumSubArray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int currSum = nums[0], maxSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}