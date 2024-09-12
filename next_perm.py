# Time complexity - O(n) 
# Space Complexity: O(1) 
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None
# Approach : 1.Find the number which is smaller than its adjacent starting from end 
#            2.Replaced it with number immediately greater than it. 
#            3.Reversed starting from its next index till end  

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:

        if nums is None or len(nums) == 0:
            return 
        
        n = len(nums)
        i = n - 2
        while i >=0 and nums[i] >= nums[i+1]:
            i -= 1
        
        if i >= 0:
            j = n-1
            while j >= 0 and nums[j] <= nums[i]:
                j -= 1
            self.swap(nums, i, j)
        
        self.reverse(nums, i+1, n-1)
        
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    
    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1