'''
time complexty: o(n)
space complexity: O(1)
'''
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        summ = 0
        for i in range(0,len(nums),2):
            summ+=nums[i]
        return summ