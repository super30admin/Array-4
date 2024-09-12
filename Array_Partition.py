# -*- coding: utf-8 -*-
"""
Created on Wed Apr  8 23:48:21 2020

@author: aggar
"""
#Problem Array Partition
# TC - O(nlogn) 
# SC - Depends on what sorting algorithm we are using. Quick sort is inplace so Space will be constand. However Incase of Merge sort space will be linear.
# Yes, this solution worked. Sort the array. Traverse on given array and do addition of elements at index i and i+2
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i= 0
        res = 0
        while i <len(nums):
            res += nums[i]
            i += 2
        return res
            
        