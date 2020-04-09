class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        
        while(i>=0 and nums[i]>=nums[i+1]):
            i -=1
        
        if i!=-1:
            j =n-1
            while(nums[j]<=nums[i]):
                j -=1
        
            self.swap(nums,i,j)
            self.reverse(nums,i+1,n-1)
        else:
            self.reverse(nums,0,n-1)
        
    def swap(self, nums, i, j):
        nums[i],nums[j] = nums[j],nums[i]
        
    def reverse(self, nums, i, j):
        while(i<j):
            nums[i],nums[j] = nums[j],nums[i]
            i +=1
            j -=1
            