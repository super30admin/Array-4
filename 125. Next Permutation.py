class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2
        # Find the place in the nums we should be replacing with next greater number
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        j = n - 1  # staring j from last again
        # if we find the breach we swap the number with the next greater number if not we reverse the
        # Entire nums without swapping the numbers
        if i >= 0:
            while nums[j] <= nums[i]:
                j -= 1
            self.swap(nums, i, j)

            self.reverse(nums, i + 1, n - 1)
        else:
            self.reverse(nums, 0, j)

    def reverse(self, nums, i, j):
        while i < j:
            self.swap(nums, i, j)
            i += 1
            j -= 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp   

# Arrays
# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


