// Time Complexity : O(n)
// Space Complexity : O(1)
// Method used : Kadane's Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0, max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];

            max_sum = Math.max(sum, max_sum);

            if(sum < 0) sum = 0;
        }

        return max_sum;
    }
}