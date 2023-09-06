#TC:O(n)
#SC:O(1)
class Solution:
    def nextPermutation(self, nums):
        n = len(nums)

        # Find the first pair of adjacent elements where nums[i] < nums[i+1].
        i = n - 2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1

        if i >= 0:
            # Find the smallest element to the right of i that is greater than nums[i].
            j = n - 1
            while j > i and nums[j] <= nums[i]:
                j -= 1

            # Swap nums[i] and nums[j].
            nums[i], nums[j] = nums[j], nums[i]

        # Reverse the subarray to the right of i.
        left, right = i + 1, n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1