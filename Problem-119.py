'''
Leetcode - Array partition I - 561 - https://leetcode.com/problems/array-partition-i/
Time complexity - o(nlogn)

'''

# Brute force solution 
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums=sorted(nums)
        res=0
        for i in range(0,len(nums),2):
            res=res+nums[i]
        return res