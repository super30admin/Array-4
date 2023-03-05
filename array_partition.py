"""
 Time Complexity O(nlogn)
 Space Complexity: O(1)
"""


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        gl_min = 0
        nums.sort()
        i, j = 0, 1
        for i in range(0, len(nums), 2):
            gl_min += nums[i]
        return gl_min
