"""
Time complexity: O(N)
Space complexity: O(1)
Compiled on leetcode?: Yes
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Find i by starting from the end and break if you find nums[i] < nums[i + 1]
        i = len(nums) - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        
        # Find the number which is just larger than the number at i
        
        if i >= 0:
            j = len(nums) - 1
            while j >= 0 and nums[j] <= nums[i]:
                j-= 1
            self.swap(nums, i, j)
        
        # Reverse the element from i + 1 until the end of array
        self.reverse(nums, i + 1, len(nums) - 1)
            
        
    def reverse(self, nums, i, j):
        while i < j:
            self.swap(nums, i, j)
            i += 1
            j -= 1
    
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        