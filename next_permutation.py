# Approach: Brute Force - Generate all permuations and find the one next to the current one given
# Time - O(N!)
# Space - O(N) by backtracking

# Optimized Solution
# Time - O(N)
# Space - O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        
        if not nums or len(nums) == 0:
            return 
        
        n = len(nums)
        
        # from the last 2nd number, find number which is smaller to the adjacent one
        i = n - 2
        while i >=0 and nums[i] >= nums[i+1]:
            i -= 1
        
        
        # if index is valid and find the number immediately greater it and swap both
        if i >= 0:
            j = n-1
            while j >= 0 and nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        
        # reverse from i+1 index onwards until end
        self.reverse(nums, i+1, n-1)
        
    
    def reverse(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
        
        