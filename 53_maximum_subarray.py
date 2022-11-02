"""

## Problem 53: Maximum Subarray

## Author: Neha Doiphode
## Date:   10-31-2022

## Description
Given an integer array nums, find the subarray which has the largest sum and return its sum.

## Examples:
    Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

    Example 2:
        Input: nums = [1]
        Output: 1

    Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23

## Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104


## Time complexity : O(n), where n is the number of elements in nums.
                        We are iterating over the array only once.

## Space complexity: O(1), we only use a few auxiliary variables to compute the running sum.

"""
from typing import List, Optional

def get_input():
    print("Enter the inetger array(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = nums[0]
        running_sum = nums[0]
        current_start = start = end = 0

        for current in range(1, len(nums)):
            #current = max(nums[ptr], current + nums[ptr])
            if nums[current] > running_sum + nums[current]:
                current_start = current
                running_sum = nums[current]
            else:
                running_sum += nums[current]

            #max_sum = max(max_sum, current)
            if running_sum > max_sum:
                start = current_start
                end   = current
                max_sum = running_sum

        print(f"start = {start}, end = {end}")
        return max_sum

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input array: {inp_array}")
print(f"Output: Dynamic programming: Maximum subarray sum: {solution.maxSubArray(inp_array)}")
