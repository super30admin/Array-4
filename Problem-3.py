# Time Complexity :O(n)
# Space Complexity :O(1) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
class Solution(object):
    # swap funct
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    # reverse fuct
    def reverse(self,nums,start,end):
        while start < end:
            self.swap(nums,start,end)
            start +=1
            end -=1
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        m = len(nums)
        # start from second place from back
        i = m-2
        # reach the place where you can swap
        while i >=0 and nums[i+1] <= nums[i]:
            i-=1
        # if there is a place to swap
        if i >=0:
            #find the place to swap with and swap
            j = m-1
            while nums[j] <= nums[i]:
                j-=1
            self.swap(nums,i,j)
        # reverse
        self.reverse(nums,i+1,m-1)
        