# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if len(nums)<=1: return
        breach = -1
        for i in range(len(nums)-2, -1, -1):
            if nums[i+1] > nums[i]:
                breach = i
                break

        if breach < 0:
            self.reverse(nums, 0, len(nums)-1)
            return
    
        for i in range(len(nums)-1, breach, -1):
            if nums[i] > nums[breach]:
                nums[i], nums[breach] = nums[breach], nums[i]
                break
        self.reverse(nums, breach+1, len(nums)-1)
        
    def reverse(self, nums, l, h):
        while l < h:
            nums[l], nums[h] = nums[h], nums[l]
            l += 1
            h -= 1