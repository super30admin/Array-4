#53. Maximum Subarray
"""
Time Complexity : O(n)
Space Complexity : O(1)
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        m = nums[0]
        curr = nums[0]
        for i in range(1, len(nums)):
            curr = max(nums[i], curr + nums[i])
            m = max(curr, m)
            
        return m
