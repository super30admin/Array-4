"""
Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
"""

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        if nums is None or len(nums) == 0:
            return 0

        rsum = nums[0]
        max1 = nums[0]

        for i in range(1, len(nums)):
            rsum = max(rsum + nums[i], nums[i])
            max1 = max(max1, rsum)

        return max1