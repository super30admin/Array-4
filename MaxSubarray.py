# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : We start with the first element as the current and max subarray sum.
# As we move through the array, we either extend the current subarray or start fresh from the current element.
# We keep updating the max whenever the current subarray becomes larger than the max so far.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum, current_sum = nums[0], nums[0]
        for num in nums[1:]:
            current_sum = max(num, current_sum + num)
            max_sum = max(current_sum, max_sum)
            if current_sum < 0:
                current_sum = 0
        return max_sum