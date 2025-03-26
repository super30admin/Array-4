# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # find action digit
        n = len(nums)
        action = 0
        for i in range(n-2, -2, -1):
            if nums[i] < nums[i+1]:
                action = i
                break
        
        if action == -1:
            self.reverse(nums, 0, n-1)
            return

        # find next greater
        next_g = 0
        for i in range(n-1, -1, -1):
            if nums[i] > nums[action]:
                next_g = i
                break
        
        self.swap(nums, action, next_g)
        self.reverse(nums, action + 1, n-1)

    def swap(self, nums, i , j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    
    def reverse(self, nums, i, j):
        while i < j:
            self.swap(nums, i, j)
            i += 1
            j -= 1