# // Time Complexity : O(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return nums

        n = len(nums)

        # finding breach
        i = n - 1

        while i > 0 and nums[i - 1] >= nums[i]:
            i -= 1

        j = n - 1

        # swapping two values
        if i != 0:
            while j > 0 and nums[j] <= nums[i - 1]:
                j -= 1
            nums[i - 1], nums[j] = nums[j], nums[i - 1]

        # reverse the nums
        startIndex = i
        endIndex = n - 1

        while startIndex < endIndex:
            nums[startIndex], nums[endIndex] = nums[endIndex], nums[startIndex]
            startIndex += 1
            endIndex -= 1
