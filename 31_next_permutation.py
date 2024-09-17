"""
Approach: Single pass approach
Time complexity : O(n). In worst case, only two scans of the whole array are needed.
Space complexity : O(1). No extra space is used. In place replacements are done.
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # traverse from right to left
        i = j = len(nums) - 1

        # check from right to left when the next number is smaller than current number
        while i > 0 and nums[i - 1] >= nums[i]:
            i -= 1

        # if the entire list is in descending order
        if i == 0:
            nums.reverse()
            return

        # last ascending position
        k = i - 1

        # the switch needs to happen on the right side of k with an element which is just larger than number at index k
        while nums[j] <= nums[k]:
            j -= 1

        # swap k and j
        nums[k], nums[j] = nums[j], nums[k]

        # now reverse the second part i.e after k
        l = k + 1
        r = len(nums) - 1

        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1





