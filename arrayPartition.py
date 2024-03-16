"""
Time Complexity : O(nlogn) where n is the number of elements in nums
Space Complexity : O(1) No auxillary data struture is used.

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Brute Force:
Create all the possible combinations and then loop through all the possible combinations to get the maximized (ai, bi). This requires Exponential Time complexity.

Optimal Solution:
Sort the array and then take the sum of every even index (0,2,4...)
Sorting will make sure, every pair will have closest numbers together so that the sum will be maximized
"""


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        nums.sort()
        result = 0

        for i in range(0, len(nums), 2):
            result += nums[i]
        return result
