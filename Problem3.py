# https://leetcode.com/problems/next-permutation/description/

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        pos = -1
        n = len(nums)
        for i in range(n-1, 0, -1):
            if nums[i] > nums[i-1]:
                pos = i-1
                break 

        if pos == -1:
            self.reverse(nums, 0, n - 1)
            return

        for i in range(n-1, 0, -1):
            if nums[i] > nums[pos]:
                self.swap(nums, pos, i)
                break

        self.reverse(nums, pos+1, n-1)

    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp