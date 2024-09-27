'''
Time: O(nlogn)
Space: o(1)
'''

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        res = 0
        
        nums.sort()
        for i in range(0,len(nums),2):
            res += nums[i]
        return res