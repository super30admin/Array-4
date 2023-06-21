# Time Complexity : O(n*log(n)), Where n is number of elements in nums list 
# Space Complexity : O(1), 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific
from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        #First we should sort the list
        nums.sort()
        #print(nums)
        n=len(nums)
        #print(n)
        res=0
        for i in range(0,n,2):
            res=res+nums[i]
        return res