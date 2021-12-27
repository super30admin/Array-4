# Did this code successfully run on Leetcode : YES

# TC: O(N)
# SC: O(1)

# approach
# running sum and keeping track of maximum subarray sum

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = -math.inf
        rsum = 0
        for i in range(len(nums)):
            rsum = max(rsum+nums[i], nums[i])
            max_sum = max(max_sum, rsum)
        return max_sum