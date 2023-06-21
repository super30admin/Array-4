"""
FAANMG Problem #125 {Medium } 

31. Next Permutation

Time Complexity O(n)
Space Complexity:  O(1)

Did this code successfully run on Leetcode : Yes



@name: Rahul Govindkumar_RN27JUL2022
"""
class Solution:
        # function to swap two number
    def swap(self, nums, start, end):
        nums[start], nums[end] = nums[end], nums[start]

    # function to reverse a give list
    def reverse(self, nums,start, end):
        while start < end:
            self.swap(nums, start, end)
            start += 1
            end -= 1
            
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if len(nums)==0:
            return
        
        
        # 1. Find the Breach
        n = len(nums)
        i = n - 2
        
        # starting from the end, find the element which is smaller, that is find the breach
        while( i >= 0 and nums[i] >= nums[i+1] ):
            i -=1
            
        # 2. Find the jth element to replace ith element
        if i != -1:
            j = n - 1 
            while nums[i] >= nums[j]:
                j -=1
                
            self.swap(nums, i,j)
            
        # 3. reverse the elements from i+1 till end
        # after swapping, we need to revese the numbers from breach which is i till the end
        self.reverse(nums, i+1, n-1)
                
        
            
        
        
        
        