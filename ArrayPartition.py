from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        maxSum = 0
        i = 1

        while i < len(nums):
            maxSum += min(nums[i], nums[i-1])
            i += 2
        
        return maxSum