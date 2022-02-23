# Time Complexity : O(nlogn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # sorting and then choosing the min of each pair
        if len(nums) == 1:
            return nums[0] + nums[1]

        x = sorted(nums)
        c = 0

        for i in range(0, len(nums), 2):
            c += x[i]
        return c
