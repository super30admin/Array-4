# -*- coding: utf-8 -*-
"""
Created on Wed Mar  4 18:42:54 2020

@author: WELCOME
"""
"""
Time - O(N)
Space - O(1)
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        total=nums[0]
        newTotal=nums[0]
        for i in range(1,len(nums)):
                newTotal=max(newTotal+nums[i],nums[i])
                if newTotal>total:
                    total=newTotal
                
        return total