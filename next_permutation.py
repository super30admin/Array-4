# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)-1
        l = len(nums)-1
        k = len(nums)-2

        # traverse from right to left and find the first digit which is smaller than the digit on its right ('k')
        while k >= 0 and nums[k] >= nums[k+1]:
            k -= 1

        # we couldn't find any digit (i.e. this is the biggest permutation)
        if k < 0:
            nums.reverse()

        else:
            # traverse right side of k, starting from the last index n, to find the first digit which is bigger than k ('l')
            while nums[l] <= nums[k]:
                l -= 1

            # swap k and l
            nums[l], nums[k] = nums[k], nums[l]

            # reverse the order from k+1 till n
            k += 1

            while k < n:
                nums[k], nums[n] = nums[n], nums[k]
                k += 1
                n -= 1
