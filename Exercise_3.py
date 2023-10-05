# Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No

class Solution:
    def nextPermutation(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return 0
        n = len(nums)
        i = n - 2
        # 1. find breach
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        # 2. swap
        if i != -1:
            j = n - 1
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(nums, i, j)
        # 3. reverse from i to end
        self.reverse(nums, i + 1, n - 1)

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1


sol = Solution()
print(sol.nextPermutation([1, 2, 3]))
