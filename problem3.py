# problem3.py 
#

# https://leetcode.com/problems/next-permutation/

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        if i>=0:
            j = n-1
            while nums[j] <= nums[i]:
                j = j-1
            self.swap(nums,i,j)
        self.reverse(nums,i+1,n-1)

    def reverse(self,nums,left,right):
        while left < right:
            self.swap(nums,left,right)
            left+=1
            right-=1
    
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i]= nums[j]
        nums[j]=temp