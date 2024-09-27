# -*- coding: utf-8 -*-
"""
Created on Wed Mar  4 18:39:36 2020

@author: WELCOME
"""
"""
Time - O(N)
Space - O(1)
"""

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []
        orderPtr=-1
        firstPtr=-1
        for i in range(len(nums)-1,0,-1):
            if nums[i-1]<nums[i]:
                orderPtr=i-1
                break
        
        if orderPtr!=-1:
            for i in range(len(nums)-1,-1,-1):
                if nums[i]>nums[orderPtr]:
                    firstPtr=i
                    break
            nums[orderPtr],nums[firstPtr]=nums[firstPtr],nums[orderPtr]
            self.reverse(nums,orderPtr+1)
        else:
            self.reverse(nums,0)
        return nums
            
            
        
    def reverse(self,nums,low):
        high=len(nums)-1
        while(low<=high):
            nums[low],nums[high]=nums[high],nums[low]
            low+=1
            high-=1