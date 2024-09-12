"""
Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        TC: O(N)
        SC: O(1)
        """
        n = len(nums)
        _max = nums[0]
        curr_sum = nums[0]
        
        for i in range(1, n):
            curr_sum += nums[i]
            curr_sum = max(curr_sum, nums[i])
            _max = max(_max, curr_sum)
            
        return _max
        