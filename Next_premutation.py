# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        
        # starting from the end, find the element which is smaller, that is find the breach
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
            
        # if we have found the breach, then we find a greater number from end to swap
        if i != -1:
            j = n-1
            while nums[i] >= nums[j]:
                j -= 1
                
            #swap those elements
            self.swap(nums, i, j)
        
        # reverse the elements from i+1 till end
        # after swapping, we need to revese the numbers from breach which is i till the end
        self.reverse(nums, i+1, n-1)
    
    # function to swap two number
    def swap(self, nums, start, end):
        nums[start], nums[end] = nums[end], nums[start]
    
    # function to reverse a give list
    def reverse(self, nums,start, end):
        while start < end:
            self.swap(nums, start, end)
            start += 1
            end -= 1
