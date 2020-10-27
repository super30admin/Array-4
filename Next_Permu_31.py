# time - O(n)
# Space - O(1)

# Brute - Force @ We have to use Back-tracking to solve it, which takes n!
# Algo
# 1)Find peak from the end
# 2)Find the next peak element
# 3)After finding peak swap the elem into its correct position
# 4)Then reverse the list from the partition to the end of the list
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return 0
        
        i = len(nums) - 2
        j = len(nums) - 1
        
        while i >= 0 and nums[i] >= nums[i+1]:
            i -=1
        
        while j >=0 and i>=0 and nums[j] <=nums[i]:
            j -=1