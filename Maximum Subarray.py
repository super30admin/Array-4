# -*- coding: utf-8 -*-
"""
TC:O(N) as we traverse through the list
SC:O(1)
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #edge case
        #check if there is only one element in the array, if true return the element
        if (len(nums) == 1): return nums[0]
        #currMax is the maximum number in this subarray
        currMax = -inf
        #currSum
        #keep track of our current sum and whenever the current sum is negative 
        #we reset it to 0 on the next iteration and start counting from that point onwards
        currSum = 0
        for i in nums:
            currSum = max(0,currSum) + i
            currMax = max(currSum,currMax)
        return currMax
        