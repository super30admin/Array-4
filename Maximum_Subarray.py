# Time Complexity : O(N), where N is the length of the nums list
# Space Complexity : O(1)
from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0

        n = len(nums)
        max_sum = float('-inf')
        current_sum = 0

        for i in range(n):
            current_sum += nums[i]
            max_sum = max(max_sum, current_sum)
            
            if current_sum < 0:
                current_sum = 0

        return max_sum