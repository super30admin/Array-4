#Problem 1:https://leetcode.com/problems/next-permutation
#Test Cases passed on Leetcode 
#Time Complexity:    O(n) 
#Space Complexity:   O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums)==0:
            return 
        #Approach: 
        i=len(nums)-2
        #Step 1: find the breach : i.e. if we start from end , the point of breach is where we find the number smaller than the previous one
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        j=len(nums)-1
        if i>=0:
            while nums[j]<=nums[i]:
                j-=1
            # Step 2 swap the element
        self.swap(nums,i,j)
            # Step 3: Reverse remaining 
        self.reverse(nums,i+1,len(nums)-1)
        
    def swap(self, nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
    
    def reverse(self,nums,start,end):
        while start<end:
            self.swap(nums,start,end)
            start+=1
            end-=1
       