""""// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 2

        while (i >= 0 and nums[i] >= nums[i + 1]):
            i -= 1

        if (i >= 0):
            j = len(nums) - 1
            while (nums[j] <= nums[i]):
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]

        return self.reverse(nums, i + 1, len(nums) - 1)

    def reverse(self, nums, l, r):
        while (l <= r):
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
        return nums

