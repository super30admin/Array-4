"""
Time Complexity : O(n) where n is number of elements in nums array
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return 0
        n = len(nums)
        temp = -1
        # Step 1: Loacate the smaller number
        i = n - 2
        while i >= 0:
            if nums[i] < nums[i + 1]:
                temp = i
                break
            i -= 1
        # Step 2: Swap the number larger and reverse the later half
        j = n - 1
        if temp != -1:
            while j >= 0:
                if nums[j] > nums[temp]:
                    nums[j], nums[temp] = nums[temp], nums[j]
                    break
                j -= 1
        self.reverse(nums, temp + 1, n - 1)
    # Reverse function
    def reverse(self, nums, l, r):
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
            
        