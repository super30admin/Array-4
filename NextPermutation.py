# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = len(nums) - 2
        #find breach
        while i>=0 and nums[i] >= nums[i+1]:
            i-=1
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                j-=1
            self.swap(nums, i, j)
        self.reverse(nums, i+1)

    def reverse(self, nums, start):
        i, j = start, len(nums) - 1
        while i < j:
            self.swap(nums, i, j)
            i += 1
            j -= 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp