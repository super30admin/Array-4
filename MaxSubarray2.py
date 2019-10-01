#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct  1 10:00:00 2019

@author: tanvirkaur
"""

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        loc = nums[0]
        glo = nums[0]
        for i in range(1,len(nums)):
            loc = max(nums[i], loc+nums[i])
            glo = max(loc, glo)
        return glo