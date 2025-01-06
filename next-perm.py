# The nextPermutation method modifies the array to the next lexicographical permutation.

# Steps:
# - Traverse from the end to find the first decreasing element (`i`).
# - If such an element exists, find the smallest element greater than `nums[i]` on its right (`j`) and swap them.
# - Reverse the subarray after index `i` to form the smallest possible order.

# TC: O(n) - Single traversal to find `i`, `j`, and reverse the subarray.
# SC: O(1) - In-place operations.


from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        i = n - 2

        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        
        if i >= 0:

            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1

            nums[i], nums[j] = nums[j], nums[i]

        nums[i + 1:] = reversed(nums[i + 1:])