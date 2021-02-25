# TC: O(NlogN)
# SC: O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        nums = sorted(nums)
        s = 0
        
        i = 0
        while i < len(nums)-1:
            s += nums[i]
            i += 2
            
        return s