# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums) :
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)

        if nums == None or n == 0:
            return
        i = n - 2

        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        if i >= 0:
            j = n - 1
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(nums, i, j)
        self.reverse(nums, i + 1, n - 1)

    def reverse(self, nums, left, right):
        while left < right:
            self.swap(nums, left, right)
            left += 1
            right -= 1

    def swap(self, nums, left, right):
        nums[left], nums[right] = nums[right], nums[left]







