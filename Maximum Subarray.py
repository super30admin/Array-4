# Time complexity : O(n)
# Space complexity : O(1)

# The code ran on Leetcode

# Iterate over the array and maintain a running sum. If adding the current number to running sum increases the running sum, add it. If not, start the new running sum at the current index.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        rSum = res = nums[0]
        for i, val in enumerate(nums[1:]):

            if val + rSum > val:
                rSum = val + rSum
            else:
                rSum = val
            res = max(res, rSum)
        return res