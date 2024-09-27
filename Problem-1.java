//TC: O(n)
//SC: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int sum = 0;
        int maxSum = nums[0];
        
        for(int num : nums)
        {
            sum = Math.max(num, num + sum);
            maxSum = Math.max(sum, maxSum);
        }
        
        return maxSum;
    }
}