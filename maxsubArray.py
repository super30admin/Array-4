"""
## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],

Output: 6

Explanation: [4,-1,2,1] has the largest sum = 6.

time - O(N)
SPACE -CONSTANT
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        print(nums[0])
        if nums == None or len(nums) == 0:
            return 0
        local_sum = nums[0]
        global_sum = nums[0]

        for num in nums[1:]:
            local_sum = max(num, local_sum + num)   # local is running sum
            global_sum = max(global_sum, local_sum)  # global

        return global_sum



class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        for i in range(1, len(nums)):
            if nums[i - 1] > 0:
                nums[i] = nums[i] + nums[i - 1]
        return max(nums)
