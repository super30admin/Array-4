"""
Implemented using a 3-step algorithm:
1. Find the first index `i` from the end where nums[i] < nums[i+1].
2. Find the first index `j` from the end where nums[j] > nums[i] and swap them.
3. Reverse the subarray from i+1 to the end to get the next lexicographical permutation.
Time Compelxity: O(n)
Space Compelxity: O(1)
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2

        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
        
        if i >= 0:
            j = n - 1
            while nums[i] >= nums[j]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]

        left, right = i + 1, n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1