class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        #O(N)
        #O(1)
        if not nums:
            return 
        n=len(nums)
        #step1>find position coming from back side, where element is less than its adjacent
        i=n-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        #this ith position is the position of mismatch
        #step2)traverse from back and find immediate greater element> swap
        if i>=0:
            j=n-1
            while j>=0 and nums[j]<=nums[i]:
                j-=1
            self.swap(nums,i,j)
        #step3
        #reverse other part after mismatch till end
        self.reverse(nums,i+1,n-1)
    def swap(self,nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
    def reverse(self,nums,l,r):
        while l<=r:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1
        