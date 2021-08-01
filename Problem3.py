# Time Complexity : O()
# Space Complexity : O()
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# find the breaking point of the increasing numbers from last then find the number grater than the
# the number at breaking point then swap those two and reverse all the elements next to the breaking point
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if nums == None:
            return
        n = len(nums)
        i = n-2
        
        while i >= 0 and nums[i] >= nums[i+1]:
            i-=1
        if i == -1:
            self.reverse(nums,0)
            return
        j = n-1
        
        while nums[i] >= nums[j]:
            j -= 1
        nums[i],nums[j] = nums[j],nums[i]
        
        self.reverse(nums,i+1)
    
    def reverse(self,nums,start):
        
        i = start
        j = len(nums)-1
        
        while i < j:
            nums[i],nums[j] = nums[j],nums[i]
            i += 1
            j -= 1
        
        