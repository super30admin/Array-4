class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Identify where it is breaking - i
        n = len(nums)
        i = n - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        # Identify next largest than i and swap
        j = n - 1
        if i >= 0:
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(i, j, nums)

        # Reverse from i+1
        self.reverse(i + 1, n - 1, nums)

    def swap(self, a, b, nums):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp

    def reverse(self, x, y, nums):
        while x < y:
            self.swap(x, y, nums)
            x += 1
            y -= 1