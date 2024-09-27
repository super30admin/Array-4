# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using 2 variables. Initialize both to first element in nums array.
# Iterate over the array and get the maximum between current element and sum of currentMax
# Then get the maximum between cureentMax and globalMax
# Return globalMax


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentMax = nums[0]
        globalMax = nums[0]

        for i in range(1, len(nums)):
            currentMax = max(currentMax + nums[i], nums[i])
            globalMax = max(currentMax, globalMax)

        return globalMax