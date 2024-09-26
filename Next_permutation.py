# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
class Solution:
    def reverse(self, nums, start, end):
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1

    def nextPermutation(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        end = len(nums) - 2
        while end >= 0 and nums[end] >= nums[end + 1]:
            end -= 1
        if end < 0:
            self.reverse(nums, 0, len(nums) - 1)
            return
        breach = end
        for i in range(len(nums) - 1, end - 1, -1):
            if nums[i] > nums[breach]:
                nums[i], nums[breach] = nums[breach], nums[i]
                break
        self.reverse(nums, breach + 1, len(nums) - 1)
        return nums


print(Solution().nextPermutation([1, 2, 4, 9, 3, 8, 6, 5, 4, 2]))
