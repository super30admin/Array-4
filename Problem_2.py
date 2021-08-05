from typing import List
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        rSum = nums[0]
        maximum = nums[0]
        for i in range(1, len(nums)):
            rSum = max(rSum + nums[i], nums[i])
            maximum = max(rSum, maximum)
        return maximum

# Time Complexity: O(n)
# Space Complexity: O(1)