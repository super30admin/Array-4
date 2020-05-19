// Time complexity: O(N)
// Space complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            sum += nums[i];
            if (nums[i] > sum)
            {
                sum = nums[i];
            }
            if (max < sum)
            {
                max = sum;
            }
            
        }
        return max;
    }
}