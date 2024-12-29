"""
TC: O(n)
Sp: O(1)
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum = 0
        maxsum = nums[0]
        for n in nums:
            currsum = max(currsum+n, n)
            maxsum = max(maxsum, currsum)
        return maxsum
        