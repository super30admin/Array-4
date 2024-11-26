# -*- coding: utf-8 -*-
"""
TC: O(NlogN) where N = # of elements in the list
SC: O(1)
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        #sort the list
        #start from the last element and append every alt. element to the list        
        nums.sort()
        answer = 0
        i = (len(nums) - 1)
        while (i > 0): 
			# because it's sorted, we only need every other value
            answer += nums[i-1]
            i -= 2
        return answer
