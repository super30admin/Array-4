# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def nextPermutation(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(l, h):
            while h > l:
                tmp = nums[h]
                nums[h] = nums[l]
                nums[l] = tmp
                l += 1
                h -= 1

        n = len(nums)
        i = len(nums)-1
        while i >= 0:
            if i < len(nums)-1:
                if nums[i] < nums[i+1]:
                    breach = nums[i]
                    break
            i -= 1

        if i == -1:
            reverse(0, n-1)
            return

        j = len(nums)-1
        while j >= 0:
            if nums[j] > nums[i]:
                tmp = nums[i]
                nums[i] = nums[j]
                nums[j] = tmp
                break
            j -= 1
        reverse(i+1, n-1)