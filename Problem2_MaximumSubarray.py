# Time Complexity: O(n), where n is length of the input array
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0

        curr = nums[0]
        maximum = nums[0]

        # For every value, compute the maximum sum and update the global maximum
        for i in range(1, len(nums)):
            curr = max(nums[i], curr + nums[i])
            maximum = max(maximum, curr)

        # Return the global maximum
        return maximum