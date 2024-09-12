"""
Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
"""

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        TC : O(N)
        SC: O(1)
        """
        n = len(nums)
        if n == 1: return 
        temp = -1
        low = n-2
        
        # FIND THE BREACH
        while low >= 0 and nums[low] >= nums[low + 1]:
            low -= 1
        
       
        # FIND THE NUMBER GREATER THAN THE NUMS[LOW]
        if low != -1:
            for i in range(n-1, low, -1):
                if nums[low] < nums[i]:
                    self.swap(nums, low, i)
                    break
         # REVERSE THE NUMS FROM LOW +1 TILL END      
        self.reverse(nums, low + 1, n-1)
                
    def swap(self, nums, i, j):
        if i!=j :
            x= nums[i]
            nums[i] = nums[j]
            nums[j] = x
        
    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l+= 1
            r-=1
        
                
        