"""
Time Complexity : O(n) where n is the number in nums
Space Complexity : O(1) No auxillary data struture is used.

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        if len(nums) == 0:
            return nums

        # 1. Find the breach
        i = len(nums) - 2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1

        # 2. Find ansd swap next greater element
        if i != -1:
            j = len(nums) - 1
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(nums, i, j)

        # 3. Reverse from i + 1
        self.reverse(nums, i+1, len(nums)-1)

    def reverse(self, nums, i, j):
        while i < j:
            self.swap(nums, i, j)
            i += 1
            j -= 1

    def swap(self, nums, i, j):
        if i != j:
            nums[i] = nums[i] + nums[j]
            nums[j] = nums[i] - nums[j]
            nums[i] = nums[i] - nums[j]
