// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    At every index, we have 2 choices, either to start a new subarray or go with the previous sybarray.
    We use a DP Array to keep track of this.
*/

class Solution
{
public:
    int maxSubArray(vector<int> &nums)
    {
        int n = nums.size();
        vector<int> dp(n, 0);
        dp[0] = nums[0];
        int sum = dp[0];
        for (int i = 1; i < n; i++)
        {
            dp[i] = max(nums[i], nums[i] + dp[i - 1]);
            if (dp[i] > sum)
                sum = dp[i];
        }
        return sum;
    }
};