"""
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""
class Solution:
    def rev(self, nums, l, h): #function to reverse
        
        while l < h:
            tmp = nums[l]
            nums[l] = nums[h]
            nums[h] = tmp
            l += 1
            h -= 1
            
        return nums
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 2
        j = len(nums) - 1
        
        while nums[i] >= nums[i+1] and i >= 0: #checking for ascending order from RHS
            i -= 1
        
        if i == -1: #if entire array is in ascending order, reverse the entire list
            nums = self.rev(nums,0, len(nums)-1)
        
        else:
            while nums[j] <= nums[i]: #else, find a number in right subarra that is just bigger than nums[i]
                j -= 1
            tmp = nums[i] #swap the numbers
            nums[i] = nums[j]
            nums[j] = tmp
            
            nums = self.rev(nums, i+1, len(nums)-1) #reverse numbers till end from i+1 location
        