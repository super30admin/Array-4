# Problem 2 : Maximum Subarray
# Time Complexity : O(n) where n is the number of elements in nums array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
None
'''

# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # if the length of the nums array is 0 then return 0
        if len(nums) == 0:
            return 0
        # define current and maxSum variable and set the value to nums[0]
        current = nums[0]
        maxSum = nums[0]
        # iterate through nums array from 1st index
        for i in range(1, len(nums)):
            # calculate the current as maximum between sum of current and nums[i] and nums[i]
            current = max(current + nums[i], nums[i])
            # calculate the maxSum as maximum between maxSum and current
            maxSum = max(maxSum, current)
        # return maxSum 
        return maxSum