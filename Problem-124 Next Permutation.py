# 31. Next Permutation
# https://leetcode.com/problems/next-permutation/

# Logic: We start comparing from the last element to its just next element. 
# We stop when the next element is less and save its index. This is the 
# element we have to swap. Now iterate from the end again and find the 
# first element that is greater than the element at swap index. We swap 
# these elements and then reverse all the elements from swap+1 till the end.

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def _reverse(self, nums, i, j):
        while i < j:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1
            
    def nextPermutation(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 1:
            return nums
        
        n = len(nums)
        
        i = n-1
        j = n-1
        swapLocation = -1
        
        for j in range(n-1, 0, -1):
            if nums[j] > nums[j-1]:
                swapLocation = j - 1
                break
        
        if swapLocation == -1:
            self._reverse(nums, 0, n-1)
            return
        
        for i in range(n-1, swapLocation, -1):
            if nums[i] > nums[swapLocation]:
                nums[i], nums[swapLocation] = nums[swapLocation], nums[i]
                break
        
        self._reverse(nums, swapLocation+1, n-1)

obj = Solution()
print(obj.nextPermutation([1,1,5]))