"""
we first find the pivot element where the num is less that its previous element, so that we can swap the next greater element with it through another loop (j here) and then
reverse everything(excluding the i) so that its just greater than the previous permuation
TC is O(N) and SC is O(1)
"""


class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2

        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1 #found the pivot
        
        if i >= 0: #if bcz this should run only once and reverse all if no such thing exist
            j = n -1 #start from back till you find j element > i
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i] #swap them

        l, r = i + 1, n - 1 #reverse the rest
        while l < r: 
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1


        