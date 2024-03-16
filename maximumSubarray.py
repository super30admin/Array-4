"""
Time Complexity : O(n) where n is the number in nums
Space Complexity : O(1) No auxillary data struture is used.

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        currSum = nums[0]
        maxSum = nums[0]

        for i in range(1, len(nums)):
            currSum = max(nums[i], currSum + nums[i])
            maxSum = max(maxSum, currSum)

        return maxSum
