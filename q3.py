# Time Complexity : O(n), Where n is number of elements in nums list 
# Space Complexity : O(1), 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

from typing import List

class Solution:
    def reverse(self,array,l,r):
        while(l<=r):
            array[l],array[r]=array[r],array[l]#Swap the elements
            l+=1
            r-=1
        
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        index=-1
        n=len(nums)
        #Find the index at which the descending order breaks from the right
        for i in range(n-2,-1,-1):
            if(nums[i]<nums[i+1]):
                index=i
                break
        #print(index)
        #print(nums)
        #We will try to find the next maximum value after the nums[index]
        if(index!=-1):
            for i in range(n-1,-1,-1):
                if(nums[i]>nums[index]):
                    #do swap
                    nums[i],nums[index]=nums[index],nums[i]
                    break
        #print(nums)
        #Now reverse all the elements left of the index
        self.reverse(nums,index+1,n-1)
            
        