// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


# Method
# 1. Check the numbers are sorted in decending order.
# 2. if sorted to get the next greater element and swap the numbers. 
   # reverse them to get the minimum numbers.
# 3. if not sorted in decreasing order, swap number and reverse it.


class Solution:
    
    def swap(self,nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
    
    def reverse(self,nums,l,r):
        while l<r:
            nums[l],nums[r] =nums[r],nums[l] 
            l=l+1
            r=r-1
  

            
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        n=len(nums)
        
        
        for i in range(n-2,-1,-1):
    
            if nums[i] < nums[i+1]:
                    j=n-1
                    while j>i:
                        if nums[j]>nums[i]:
                            break
                        j=j-1
                    self.swap(nums,i,j)
                    self.reverse(nums,i+1,n-1)
                    return
                
        self.reverse(nums,0,n-1)
            
                
                
                
	
	
        