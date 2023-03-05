"""
 Time Complexity O(n)
 Space Complexity: O(1)
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        i = 0
        j = 1
        rsum = nums[0]
        gl_max = nums[0]
        while i <= j and j < len(nums):
            print(rsum)
            rsum += nums[j]
            if rsum < nums[j]:
                rsum = nums[j]
                i = j
                j = i
            gl_max = max(gl_max, rsum)
            j += 1
        return gl_max
