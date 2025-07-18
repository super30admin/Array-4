class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Time: O(n)
        # space: O(1)
        rSum = 0
        maximum = 0
        for i in range(len(nums)):
            # Check if the current sum is a better choice or is the current number a better choice
            rSum = max(rSum + nums[i], nums[i])
            maximum = max(maximum, rSum)
        return maximum