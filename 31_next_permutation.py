from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """
            https://leetcode.com/problems/next-permutation/
            Time Complexity - O(n)
            Space Complexity - O(1)
            Approach: 
                - Find first number such that current number is lesser than the next number
                - Find the second number such that it is greater than the first number 
                - Swap the first and second number
                - Reverse from the one ahead of the first number to get the lowest possible order
        """
        i = len(nums) - 2

        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        j = len(nums) - 1
        if i >= 0:
            while j > i and nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]

        self._reverse(nums, i + 1, len(nums) - 1)

    def _reverse(self, nums, start, end):

        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1


if __name__ == '__main__':
    Solution().nextPermutation([2, 3, 1])
    Solution().nextPermutation([1, 5, 1])
