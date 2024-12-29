"""
Tc: O(n)
SP:O(1)
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        #identify breach
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        #swap with next biggest number
        if i>=0:
            j = n-1
            while j>=0 and nums[j]<=nums[i]:
                j-=1
            nums[i], nums[j] = nums[j], nums[i]
        # reverese the rest of elements
        i+=1
        j = n-1
        while i<j:
            nums[i], nums[j] = nums[j], nums[i]
            i+=1
            j-=1