# Time complexity - O(nlogn) 
# Space Complexity: O(1) 
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None
# Approach : 1. Sort the array. 2.add every number at odd position to the sum.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums)==0:
            return 0
        sum = 0
        nums.sort()
        for i in range(0,len(nums),2):
            sum += nums[i]
            
        return sum