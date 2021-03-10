# -*- coding: utf-8 -*-
"""
TC:O(N) where N is the number of elements in the list
SC:O(1)
"""
#iterative solution of checking increasing numbers
#sliding window technique used with left and right pointers
class Solution:
    def nextPermutation(self, nums) -> None:
        n = len(nums)
        for i in range(1,n):
            if nums[n-1-i] < nums[n-i]:
                for j in range(len(nums[n-i:])):
                    if nums[n-1-j] > nums[n-1-i]:
                        nums[n-1-i],nums[n-1-j] = nums[n-1-j],nums[n-1-i]
                        break
                left = n - i
                right = n - 1
                while left < right:
                    nums[left],nums[right] = nums[right],nums[left]
                    left += 1
                    right -= 1
                return
		# need to sort the list
		# nums.sort() # 1 
        left = 0 #2
        right = n - 1
        while left < right:
            nums[left],nums[right] = nums[right],nums[left]
            left += 1
            right -= 1

      
