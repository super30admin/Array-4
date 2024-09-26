#Time Complexity - O(n)
#Space Complexity - O(1)
class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        k, l = len(nums) -2 , len(nums) - 1
        while k >= 0 and nums[k] >= nums[k+1]:
            k -= 1
        if k == -1:
            return nums.reverse()
        while nums[k] >= nums[l]:
            l -= 1
        nums[k], nums[l] = nums[l], nums[k]
        nums[k+1:]=reversed(nums[k+1:])