# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
'''
1. We find the breach element wich would be the next potential elment that could be replaced
2. To find the element to replace with, traverse from end and look at the element gretaer than breach element
3. Swap it, and reverse the remainder of the lement from that index to last 
'''

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) < 2:
            return
        
        i = len(nums)-1
        j = len(nums)-2
        
        while i >=0 and j >= 0 and nums[j] >= nums[i]:
            
            j -=1
            i -= 1
            
        if j < 0:
            return self.reverse(nums, 0, len(nums)-1)
        
        #found breach
        # print ("breach",j, nums[j])
        
        i = len(nums)-1
        while i>=0 and nums[i] <= nums[j]:
            i -= 1
            
        nums[j], nums[i] = nums[i], nums[j]
         
        self.reverse(nums, j+1, len(nums)-1)
                
               
        
    def reverse(self, arr, start, end):
        
        while start < end:
            
            arr[start], arr[end] = arr[end], arr[start]
            start += 1
            end -= 1
            
        