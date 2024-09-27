------------------------Next Permutation--------------------------------------------

# Time Complexity : O(N) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here we can find it in 3 steps. First we will find the breach that the element from the last is less than previous
one. one we find breach we will again find the number which is greater than breach from last. and then swap both the numbers
Once we swap we will have next numbers in decreasing order. so we will reverse them to get next permutations.

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if not nums:
            return None
        i = len(nums)-2
        while i>=0 and nums[i]>=nums[i+1]:
            i -=1
        
        if i>=0:
            j = len(nums)-1
            while nums[i]>=nums[j]:
                j -=1
            
            nums[j], nums[i] = nums[i], nums[j]
        nums[i+1:] = nums[i+1:][::-1]