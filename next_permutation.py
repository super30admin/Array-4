# Did this code successfully run on Leetcode : YES

# TC: O(N)
# SC: O(1)

# find breach from end - where nums[i+1] > nums[i]
# determine immediate greatest to right side
# swap these two
# reverse from breach index onwards

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        while i >= 0 and nums[i+1] <= nums[i]:
            i -= 1
            
        def reverse(s, e):
            while s < e:
                nums[s], nums[e] = nums[e], nums[s]
                s += 1
                e -= 1
        # find next immediate greatest
        if i >= 0:
            j = n-1
            while nums[j] <= nums[i]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        reverse(i+1, n-1)