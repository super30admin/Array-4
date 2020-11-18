"""
Leetcode: https://leetcode.com/problems/array-partition-i/

Approach: Using Sorting
Time complexity : O(nlog(n)). Sorting takes O(nlog(n)) time. We iterate over the array only once.
Space complexity : O(1). Constant extra space is used.
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum = 0

        for i in range(0, len(nums), 2):
            sum += nums[i]

        return sum