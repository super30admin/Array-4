# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
'''
1. Sort the array and sum the element skipping every alternate element
'''
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        if len(nums) < 1:
            return
        
        nums.sort()
        
        sum_ = 0
        for i in range(0,len(nums),2):
            sum_ += nums[i]
            
        return sum_
        