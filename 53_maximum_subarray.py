"""
Leetcode: https://leetcode.com/problems/maximum-subarray/

Approach: Greedy
Time Complexity: O(N) since its one pass along the array
Space Complexity: O(1) since its constant space solution
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        curr_sum = max_sum = nums[0]

        for i in range(1, n):
            curr_sum = max(nums[i], curr_sum + nums[i])
            max_sum = max(max_sum, curr_sum)

        return max_sum



