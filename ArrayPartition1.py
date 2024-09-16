#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct  1 10:01:57 2019

@author: tanvirkaur
"""

class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums = sorted(nums)
        summ =0
        if not nums:
            return None
        for i in range(0,len(nums)-1,2):
            summ += nums[i]
        return summ