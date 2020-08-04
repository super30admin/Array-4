# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach

# This approach looks for a discrepancy in the descending order of the number from the end.
# Then finds the next bigger number to derive the next greater permutation.
# In the end reverse the num from one ahead of the swapped position until the end.
class Solution(object):
    def nextPermutation(self, nums):
        if not nums:
            return 0
        i = len(nums) - 2
        # Find discrepancy, i.e. where num is smaller than num after
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        # if discrepancy found
        if i >= 0:
            j = len(nums) - 1
            # Finding num to swap with
            while nums[i] >= nums[j]:
                j -= 1
            # swap num & discrepancy
            nums[i], nums[j] = nums[j], nums[i]
        # Reverse everything from swapped pos+1 until end
        # is no discrepancy found the entire number is reversed
        self.reverse(nums, i + 1, len(nums) - 1)

    def reverse(self, nums, i, j):
        while i < j:
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1
