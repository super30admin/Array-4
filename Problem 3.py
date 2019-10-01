# Time Complexity : O(n) where n is length of list
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # if lenght of nums is less than 2 the simply return nums
        if len(nums) < 2:
            return nums

        # method for swapping 2 numbers
        def swap(l, r):
            nums[l], nums[r] = nums[r], nums[l]

        # method for reversing nums from start index to end index
        def reverse(start, end):
            while start < end:
                swap(start, end)
                start += 1
                end -= 1

        n = len(nums) - 2
        j = len(nums) - 1

        # start from end and find the number whose value is less than the its next number as we can replace that number with its immediate greater number present in nums
        while (n >= 0 and nums[n] >= nums[n + 1]):
            n -= 1

        # if the entire list of nums is in descending order then it is the biggest number that can be made, so simply reverse the list of nums to get the smallest number
        if n == -1:
            x = nums[::-1]
            nums.clear()
            nums = x
        else:
            # Find the next bigger number than that we found so that we can swap both the numbers to find the next biggest number overall
            while (j >= 0 and nums[j] <= nums[n]):
                j -= 1

            # swap bot the numbers found
            swap(n, j)
            # sort/ reverse the right part of the nums to make sure it is in ascending order, i.e the next bigger number than that we have in nums
            reverse(n + 1, len(nums) - 1)

