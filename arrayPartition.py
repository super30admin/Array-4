"""
Time complexity: O(N)
Space complexity: O(1)
Compiled on leetcode?: Yes
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        loc = nums[0]
        glob = nums[0]
      
        for i in range(1, len(nums)):
            loc = max(nums[i] + loc, nums[i])
            glob = max(loc, glob)
        return glob    