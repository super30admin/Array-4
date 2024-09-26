#Time: O(n)
#Space: O(1)
#Program ran on leetcode succcessfully

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None:
            return
        n = len(nums)
        i = n - 2
        while (i >= 0 and nums[i] >= nums[i+1]):
            i += -1
        
        if i != -1:
            j = n - 1
            while(nums[i] >= nums[j]):
                j += -1
            self.swap(nums, i, j)
        
        self.reverse(nums, i+1, n-1)
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    
    def reverse(self, nums, l, r):
        while (l <= r):
            self.swap(nums, l, r)
            l += 1
            r += -1