# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        t = -1
        n = len(nums)
        for i in range(n-2, -1, -1):
            if nums[i] < nums[i + 1]:
                t = i
                break
        if t == -1:
            self.reverse(nums, 0, n - 1)
            return
        
        for i in range(n - 1, t, -1):
            if nums[i] > nums[t]:
                nums[i], nums[t] = nums[t], nums[i]
                break
        
        self.reverse(nums, t+1, n-1)
        return
    
    def reverse(self, nums, l, r):
        while l <=r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
        