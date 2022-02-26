"""
Given an integer array nums of 2n integers, group these integers 
into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) 
for all i is maximized. Return the maximized sum.

"""

# Time Complexity : O(n log n)
# Space Complexity : O(n)
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        res = 0
        nums.sort()

        for i in range(0, len(nums), 2):
            res = res + nums[i]

        return res
