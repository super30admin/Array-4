'''
    Time Complexity: O(n)
    Space Complexity: O(1)
'''
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2

        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1

        if i >= 0:
            j = n-1

            while nums[i] >= nums[j]:
                j -= 1

            nums[i], nums[j] = nums[j], nums[i]

            self.reverse(nums, i+1, n-1)
        else:
            self.reverse(nums, 0, n-1)

    def reverse(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1