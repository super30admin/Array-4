# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSum = nums[0]
        curSum = 0

        for num in nums:
            if curSum + num < num:
                curSum = num
            else:
                curSum = curSum + num
            maxSum = max(maxSum, curSum)
        return maxSum
