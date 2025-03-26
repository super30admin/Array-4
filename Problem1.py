# Problem 1 : Array Partition
# Time Complexity :  O(n log n) where n is the number of elements in the list
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
'''
None
'''

# Your code here along with comments explaining your approach
from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # edge case if the length is less than 2 then reurn 0
        if len(nums) < 2:
            return 0
        # sort the nums array
        nums.sort()
        # if the length is equal to 2 then return the minimum of the nums array
        if len(nums) == 2:
            return min(nums)
        # define sum to 0
        sum = 0
        # iterate the nums array and increment by 2
        for i in range(0, len(nums), 2):
            # add the values of elements at even position
            sum += nums[i]
        # return sum
        return sum
