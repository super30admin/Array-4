# Time Complexity : O(n), n = length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Explanation:
# 1. Iterate through array keeping track of current subarray sum.
# 2. If current sum becomes negative, reset it to 0.
# 3. Keep track of the maximum sum seen so far.
# 4. Return the maximum sum.

from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = curr_sum = nums[0]
        for num in nums[1:]:
            curr_sum = max(num, curr_sum + num)
            max_sum = max(max_sum, curr_sum)
        return max_sum