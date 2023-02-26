// Time Complexity = O(n)
// Space Complexity = O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int result = nums[0];
        int currSum = nums[0];
        
        for(int i =1; i< n; i++){
            currSum = Math.max(nums[i], nums[i] + currSum);
            result = Math.max(currSum, result);
        }
        return result;
    }
}