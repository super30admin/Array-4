# TC: O(N)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_max = - math.inf
        abs_max = - math.inf
        for i in nums:
            curr_max = max(curr_max + i, i)
            abs_max = max(abs_max, curr_max)
        
        return abs_max
        
        
