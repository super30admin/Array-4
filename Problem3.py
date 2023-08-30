#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=len(nums)-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1

        j=len(nums)-1
        if i>=0:
            while nums[j]<=nums[i]:
                j-=1
        
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp

        nums[i+1:]=nums[i+1:][::-1]