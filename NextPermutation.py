# TC: O(N) since we will be iterating over the array elements exactly once
# SC: O(1) as we do not use any extra space. 

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums) == 0: 
            return
        
        n = len(nums)
        def swap(i, j): 
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        
        def reverse(start, end): 
            while start <= end: 
                swap(start, end)
                start += 1
                end -= 1
        
        i = n - 2
#         traverse till you find the breach 
        while i >= 0 and nums[i] >= nums[i + 1]:
                i -= 1
        j = n - 1
        if i >= 0: 
            while nums[j] <= nums[i]: 
                j -= 1
#                 swap the ith and jth positions
            swap(i, j)
#     reverse from i + 1th position
        reverse(i + 1, n - 1)
