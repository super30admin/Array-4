//TC: O(n)
//SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int currSum = 0;
        int maxSum = nums[0];
        
        for(int n : nums){
            currSum = Math.max(n, currSum + n);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}