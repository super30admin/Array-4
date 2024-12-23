class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2
        # breach identification, if ith element is lesser than (i+1)th element else we continue to reduce i and move left to check the breach on the left part of the array
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        # if breach may or may not be identified, find the next greatest element to swap with i to form the
        if i >= 0:
            j = n - 1
            while nums[i] >= nums[j]:
                j -= 1
            nums[i], nums[j] = nums[j], nums[i]
        # reverse the part after i to find the next smallest element after the swap
        l, r = i + 1, n - 1
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1

        # time complexity is O(n)
        # sapce complexity is O(1)
