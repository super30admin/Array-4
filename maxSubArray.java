//TC - O(n)
//SC - O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxSum = nums[0];
        int currSum = nums[0];
        int start = 0;
        int end = 0;
        int currStart = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > currSum + nums[i])
            {
                currStart = i;
                currSum = nums[i];
            }
            else
            {
                currSum = currSum + nums[i];
            }
            if(currSum > maxSum){
                maxSum = currSum;
                start = currStart;
                end = i;
            }
        }
        return maxSum;
    }
}