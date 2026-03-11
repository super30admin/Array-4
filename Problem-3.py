# Time Complexity : O(n), n = length of nums
# Space Complexity : O(1), in-place rearrangement
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Explanation:
# 1. Find the first decreasing element from right (pivot).
# 2. Find the smallest number greater than pivot to its right and swap.
# 3. Reverse the subarray after pivot index to get next lexicographical permutation.

from typing import List

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        i = n - 2
        
        # Step 1: Find first decreasing element
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        
        if i >= 0:
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        
        # Step 2: Reverse the subarray after i
        left, right = i + 1, n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1