# Runs on Leetcode
    # runtime is O(n), space is O(1) where n is length of nums


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        if len(nums) == 1:
            return nums[0]
        
        currentSum, globalSum, i, j = 0, float('-inf'), 0, 0
        while i < len(nums) and j < len(nums):
            if currentSum + nums[j] < nums[j]:
                currentSum = nums[j]
                i = j
            else:
                currentSum += nums[j]
            globalSum = max(currentSum, globalSum)
            j += 1
        return globalSum
