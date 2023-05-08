# Time Complexity : O(n log n), where n is the length of the nums list
# Space Complexity : O(1) 
from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result