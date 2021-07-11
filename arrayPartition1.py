"""561. Array Partition I
TC - O(NlogN)
SC - O(1)"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not len(nums):
            return 0
        nums.sort()
        res = 0
        for i in range(0,len(nums),2):
            res += nums[i]
        return res 
        