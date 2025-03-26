# Problem 3 : Next Permutation
# Time Complexity : O(n) where n is the number of elements in the nums list
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
None
'''

# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # get the length of nums list
        length = len(nums)
        # swap function to swap two values at a and b position in nums list
        def swap(nums: List[int], a: int, b: int) -> None:
            # make use of temp variable to swap the two values
            temp = nums[a]
            nums[a] = nums[b]
            nums[b] = temp
        
        # reverse function to reverse the nums list from ith position to jth position
        def reverse(nums: List[int], i: int, j: int) -> None:
            # loop till i is less than j
            while i < j:
                # swap the two numbers at ith and jth position in the nums array
                swap(nums, i, j)
                # increment the i pointer
                i += 1
                # decrement j pointer
                j -= 1
        # set i to length - 2
        i = length - 2
        # loop till i is greater than 0 and value at ith position is greater than or equal to value (i+1)th position
        while (i >= 0 and nums[i] >= nums[i+1]):
            # decrement the ith pointer
            i -= 1
        # check if i is greater than or equal to 0
        if (i >= 0):
            # set j to length - 1
            j = length - 1
            # loop till nums[i] is greater than or equal to nums[i]
            while (nums[i] >= nums[j]):
                # decrement j
                j -= 1
            # swap the values at ith and th position
            swap(nums, i, j)
        # reverse the sub-array of nums from (i+1)th to (length-1)th position
        reverse(nums, i+1, length-1)
        