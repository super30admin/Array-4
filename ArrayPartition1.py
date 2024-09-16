#561. Array Partition
"""
Time Complexity : O(n)
Space Compelxity : O(1)
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        m = 0
        i = 0
        while i < len(nums):
            m = m + nums[i]
            i = i + 2
        
        return m
