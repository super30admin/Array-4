#Time Complexity :o(n)
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no

class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if(nums==None or len(nums)==0):
            return []
        breach=False
        i=len(nums)-2
        while(i>=0 and nums[i]>=nums[i+1]):
            i-=1
        if(i>=0):
            for j in range(len(nums)-1,-1,-1):
                if(nums[i]<nums[j]):
                    break
            self.swap(nums,i,j)
        
        self.reverse(nums,i+1,len(nums)-1)
        return nums
    
    def swap(self,nums,i,j):
        tem=nums[i]
        nums[i]=nums[j]
        nums[j]=tem
        
    def reverse(self,nums,i,j):
        while(i<j):
            self.swap(nums,i,j)
            i+=1
            j-=1
        
                    
                