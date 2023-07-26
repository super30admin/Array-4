# Time Complexity : O(n)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(arr):
            l = 0
            r = len(arr)-1
            while l < r:
                temp = arr[l]
                arr[l] = arr[r]
                arr[r] = temp
                l += 1
                r -= 1
            return arr

        n = len(nums)
        i = n-2
        
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                j -= 1
            nums[j], nums[i] = nums[i], nums[j]

            nums[i+1:] = reverse(nums[i+1:])
        else:
            reverse(nums)
        