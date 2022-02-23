# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        # initialize our variables using the first element.
        curr = nums[0]
        max_arr = nums[0]
        
        # start with the 2nd element since we already used the first one.
        for num in nums[1:]:
            # if current subarray is negative, leave it. else, keep adding to it.
            curr = max(num, curr + num)
            max_arr = max(max_arr, curr)
        
        return max_arr