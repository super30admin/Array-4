# -*- coding: utf-8 -*-
"""
Created on Thu Apr  9 00:15:35 2020

@author: aggar
"""
#Problem Array Partition
# TC - O(n) 
# SC - Constant space. 
# Yes, this solution worked. Start from second last index and decrement i till element at i is greater than element at i+1.
#if Now find index j such that element at j is nearest element to at index i. Now swap both the elements and reverse the array starting from index i+1
class Solution:
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    def reverse(self,nums,start,end):
        while start < end:
            self.swap(nums,start,end)
            start += 1
            end -= 1
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        i = n-2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(nums,i,j)
        self.reverse(nums,i+1,n-1)
        