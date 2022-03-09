"""
time: O(N)
space: O(1)
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        maxSub = nums[0]
        cur = 0
        
        for num in nums:
            
            if cur < 0:
                cur = 0
            
            cur += num
            
            maxSub = max(maxSub, cur)
            
        return maxSub