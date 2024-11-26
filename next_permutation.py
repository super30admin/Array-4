# // Time Complexity :O(n) 
# // Space Complexity :O(1) 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=len(nums)-2
        while i>=0:
            if nums[i]<nums[i+1]:
                break
            i=i-1
        print(i)
        j=len(nums)-1
        if i>=0:
            while j>=0:
                if nums[j]>nums[i]:
                    break
                j=j-1
        print(j)
        nums[i],nums[j]=nums[j],nums[i]
        print(nums)
        self.reverse(nums,i+1,len(nums)-1)
        print(nums)
    def reverse(self,nums,l,r):
        while l<r:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1
        
            
            
            
            