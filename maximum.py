# The maxSubArray method finds the maximum sum of a contiguous subarray using dynamic programming.

# Use a dp table:
# - `dp[i][1]`: Maximum subarray sum ending at index `i`.
# - `dp[i][0]`: Maximum subarray sum seen so far from index `i` onward.

# Iterate from the second-to-last element to the start:
# - Update `dp[i][1]` with the maximum sum ending at `i`.
# - Update `dp[i][0]` with the global maximum subarray sum.

# TC: O(n) - Single traversal of the array.
# SC: O(n) - Space for the dp table.


from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [[0] * 2 for _ in range(n)]
        dp[n - 1][1] = dp[n - 1][0] = nums[n - 1]
        for i in range(n - 2, -1, -1):
            dp[i][1] = max(nums[i], nums[i] + dp[i + 1][1])
            dp[i][0] = max(dp[i + 1][0], dp[i][1])
        
        return dp[0][0]