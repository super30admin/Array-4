#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Sep 30 11:17:52 2019

@author: tanvirkaur
"""
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        runsum =0
        maxx = 0
        for i in range(0,len(nums)):
            runsum += nums[i]
            if runsum < 0:
                runsum = 0
            maxx = max(maxx,runsum)
        if maxx == 0:
            return max(nums)
        return maxx
            