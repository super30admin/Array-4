from typing import List
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(i,j):
            nums[i],nums[j] = nums[j], nums[i]
        def reverse(l,r):
            while l<r:
                nums[l],nums[r] = nums[r], nums[l]
                l+=1
                r-=1
        n = len(nums)
        i = n-2
        while i>=0 and  nums[i] >= nums[i+1]:
            i-=1
        if i >= 0:
            j = n-1
            while nums[j]<=nums[i]:
                j-=1
            swap(i,j)
        reverse(i+1,n-1)

        