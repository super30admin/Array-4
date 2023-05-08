# Time Complexity : O(N), where N is the length of the nums list
# Space Complexity : O(1)
from typing import List

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        # Find the first decreasing element from the right
        i = n - 2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1

        if i >= 0:
            # Find the smallest element greater than nums[i]
            j = n - 1
            while j >= 0 and nums[j] <= nums[i]:
                j -= 1

            # Swap nums[i] and nums[j]
            nums[i], nums[j] = nums[j], nums[i]

        # Reverse the elements after i
        left = i + 1
        right = n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1