# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# The pattern is to first find the breach that is iterating in reverse order we need to find the smaller element than the next element.
# If we dont find any smaller element we reverse the whole array
# After we find a smaller element we need to save the index of that element
# Second step is find the element greater then the current breaching element again in reverse order
# Then swap both the elements
# Reverse the array from the breaching element + 1 upto the length of the array to get the next permutation


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return None
        num = -1
        index = -1
        for i in range(len(nums) - 2, -1, -1):
            if nums[i] < nums[i + 1]:
                num = nums[i]
                index = i
                break
        if index > -1:
            for j in range(len(nums) - 1, -1, -1):
                if nums[j] > nums[index]:
                    nums[j], nums[index] = nums[index], nums[j]
                    break
        self.reverse(nums, index + 1, len(nums) - 1)
        return nums

    def reverse(self, nums, left, right):
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
