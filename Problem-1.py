# Time Complexity : O(n log n), due to sorting
# Space Complexity : O(1), sorting in-place
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Explanation:
# 1. Sort the array in ascending order.
# 2. Pair adjacent elements; the smaller element in each pair contributes to sum.
# 3. Sum all the smaller elements to maximize sum of min(a_i, b_i).

from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        return sum(nums[::2])