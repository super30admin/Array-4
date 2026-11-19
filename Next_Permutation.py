# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# The pattern is to first find the breach that is iterating in reverse order we need to find the smaller element than the next element.
# If we dont find any smaller element that is if index reaches -1 we reverse the whole array
# After we find a smaller element we need to save the index of that element
# Second step is find the element greater then the current breaching element again in reverse order
# Then swap both the elements
# Reverse the array from the breaching element + 1 upto the length of the array to get the next permutation
# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# The pattern is to first find the breach that is iterating in reverse order we need to find the smaller element than the next element.
# If we dont find any smaller element that is if index reaches -1 we reverse the whole array
# After we find a smaller element we need to save the index of that element
# Second step is find the element greater then the current breaching element again in reverse order
# Then swap both the elements
# Reverse the array from the breaching element + 1 upto the length of the array to get the next permutation

class Solution:
    def nextPermutation(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #breach
        index1 = -1
        index2 = -1
        for i in range(len(nums)-1, 0, -1):
            if nums[i-1] < nums[i]:
                index1 = i-1
                break
        if index1 == -1:
            self.reverse(nums, 0, len(nums)-1)
            return
        for i in range(len(nums)-1, index1, -1):
            if nums[index1] < nums[i]:
                index2 = i
                break
        nums[index1], nums[index2] = nums[index2], nums[index1]
        self.reverse(nums, index1+1, len(nums)-1)
        
    def reverse(self, nums, left, right):
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
        


        


