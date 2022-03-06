# // Time Complexity : O(n) where n is the length of the nums list.  
# // Space Complexity : O(n) where n is the length of the nums list.
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Class Solution.
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sum = float("-inf")
        n = len(nums)
        dp = [0] * n
        dp[0] = nums[0]
        max1 = dp[0]
        for i in range(1,n):
            if dp[i-1] > 0:
                dp[i] = nums[i] + dp[i-1]
            else:
                dp[i] = nums[i]
            max1 = max(max1,dp[i])
        return max1
