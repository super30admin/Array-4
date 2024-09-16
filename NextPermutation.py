#31. Next Permutation
"""
Time Complexity : O(n)
Space Complexity : O(1)
"""
class Solution:
        
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i  = len(nums) - 2
        
        while i>=0 and nums[i] >= nums[i+1] :
            i = i - 1
            
        #get numbers to swap it with
        if i >= 0: #to check if breach happned
            j = len(nums) - 1
            while nums[j] <= nums[i]:
                j = j - 1
            
                #swap nums[i] and nums[j]
            nums[i], nums[j] = nums[j], nums[i]
            
        #self.rev(nums, i+1, n-1) #reverse numbers from i+1 to n
        start = i + 1
        end = len(nums) - 1
        
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start = start + 1
            end = end - 1
            
