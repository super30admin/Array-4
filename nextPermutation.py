# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        """
        Three steps:
            - Find breach
            - Swap with greater int
            - Reverse from i+1
        """
        if not nums:
            return
        
        n = len(nums)
        #find breach
        i = n-2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
        #swap with next greater int
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                j -= 1
            self.swap(nums,i,j)
        #reverse
        self.reverse(nums, i+1, n-1)
    
    def reverse(self, nums, left, right):
        while left<=right:
            self.swap(nums,left,right)
            left += 1
            right -= 1
            
    def swap(self, nums, i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    
    