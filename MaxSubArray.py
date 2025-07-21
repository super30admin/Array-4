# Time Complexity: O(n) where n is the length of nums
# Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        rSum = 0
        maxSum = float('-inf')

        for num in nums:
            rSum = max(num, rSum+num)
            maxSum = max(maxSum, rSum)
        return maxSum