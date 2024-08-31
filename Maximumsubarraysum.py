#// Time Complexity : O(N) 
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sum =0 
        max = nums[0]
        for i in range(len(nums)):
            sum += nums[i]
            if sum > max : 
                max = sum
            if sum < 0:
                sum = 0
        return max

# Approach:
# The problem can be solved using Kadane's algorithm. The idea is to keep track of the maximum
# subarray sum ending at each position. If the current sum is less than 0, we reset
# it to 0. This way, we ensure that we are always considering the maximum subarray sum.