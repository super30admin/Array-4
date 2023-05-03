# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = len(nums) - 1
        idx = -1
        #find freach
        while i > 0:
            if nums[i] > nums[i-1]:
                idx = i-1
                break
            i -= 1
        
        #find element to replace at breach
        if idx >= 0:
            i = len(nums) - 1
            while i >= 0:
                if nums[i] > nums[idx]:
                    nums[i], nums[idx] = nums[idx], nums[i]
                    break
                i -= 1

        #arrange remaining elements in ascending order to get smallest next permutation
        l = max(idx+1,0)
        r = len(nums) - 1
        while l <= r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1