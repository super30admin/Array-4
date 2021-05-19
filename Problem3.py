## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums)==0:
            return 
        n = len(nums)
        t = -1
        for i in range(n-2,-1,-1):
            if nums[i] < nums[i+1]:
                t = i
                break
        if t !=-1:
            for j in range(n-1,t,-1):
                if nums[j]>nums[t]:
                    self.swap(nums,j,t)
                    break
        self.reverse(nums,t+1,n-1)
    
    def reverse(self, nums, l ,r):
        while l<=r:
            self.swap(nums,l,r)
            l = l+1
            r = r-1
    def swap(self, nums, l ,r):
        temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp
        
#Time Complexity: O(n)
#Space Complexity: O(1)
#Approach:  Traverse through the elements in the list. Search for a mismatch where the first element is lesser than the next element and store the index of first,
#  swap first with the immediate next greater element. Go one step ahead of the index value and reverse the entire array.     