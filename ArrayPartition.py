# -*- coding: utf-8 -*-
"""
Created on Wed Mar  4 18:49:17 2020

@author: WELCOME
"""
"""
Time - O(nlogn)
Space - O(1)
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums:
            return 0
        nums.sort()
        i=0
        sum=0
        while(i<len(nums)):
            sum+=nums[i]
            i+=2
        return sum