# -*- coding: utf-8 -*-
"""
Created on Wed Apr  8 23:57:29 2020

@author: aggar
"""

#Problem Array Partition
# TC - O(n) 
# SC - Constant space. 
# Yes, this solution worked. This is Kadane's Algorithm. We are checking whether the currentmax + element at current index is greater or element at current index. Accordingly we will update Currentmax and if currentmax is greater than globalmax then we will update the globalmax
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentmax = nums[0]
        globalmax = nums[0]
        for i in range(1,len(nums)):
            currentmax = max(nums[i], currentmax+nums[i])
            if currentmax > globalmax:
                globalmax = currentmax
        return globalmax
        