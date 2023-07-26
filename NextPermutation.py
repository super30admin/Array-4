# Time Complexity : O(N) for each operation.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to swap and reverse till every element in left is less than next element.

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        i=n-2
        while(i>=0 and nums[i]>=nums[i+1]):
            i-=1
        j=n-1
        if (i>=0):
            while(nums[i]>=nums[j]):
                j-=1
            self.swap(nums, i, j)
        self.reverse(nums, i+1, n-1)
    
    def swap(self, nums, i, j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp

    def reverse(self, nums, i, j):
        while(i<j):
            self.swap(nums, i, j)
            i+=1
            j-=1
        