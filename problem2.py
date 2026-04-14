# problem 2 

# https://leetcode.com/problems/maximum-subarray/

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        curr_sub = nums[0]
        max_sum = nums[0]
        for i in range(1,n):
            curr_sub = max(nums[i],curr_sub+nums[i])
            max_sum = max(max_sum,curr_sub)
        return max_sum