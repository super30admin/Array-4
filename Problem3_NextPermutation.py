'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 31. Next Permutation


# https://leetcode.com/problems/next-permutation/

#-----------------
# Time Complexity: 
#-----------------
# O(N): Maximum N elements traversed
#------------------
# Space Complexity: 
#------------------
# O(1) - In place swapping. Need temp variable. Constant space

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        def reverse(nums, l, r):
            while l < r:
                temp = nums[l]
                nums[l] = nums[r]
                nums[r] = temp
                l += 1
                r -= 1
        
        def swap(nums, i, j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        
        if len(nums) == 0:
            return None
        
        n = len(nums)
        
        i = n-2
        
        while i>=0 and nums[i] >= nums[i+1]:
            i -= 1
        
        if i >= 0:
            j = n - 1
            while nums[i] >= nums[j]:
                j -= 1
            swap(nums, i, j)
        
        reverse(nums, i+1, n-1)