# Time Complexity : O(n), Where n is number of elements in nums list 
# Space Complexity : O(1), 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

from typing import List
import sys

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        res=-sys.maxsize - 1
        maxi=-sys.maxsize - 1
        n=len(nums)
        for i in range(n):
            res=max(res+nums[i],nums[i])
            if(res>maxi):
                maxi=res
        return maxi
            