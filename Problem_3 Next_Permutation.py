# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None:
            return
        n = len(nums)
        i = n - 2
        #Look for number to be swapped with
        while i >= 0 and nums[i] >= nums[i + 1]:
            #Check if number is greater
            i -= 1
        if i >= 0:
            j = n - 1
            while nums[i] >= nums[j]:
                j -= 1
            #Replace it with the next greater number
            self.swap(nums, i, j)
            #Reverse the number
        self.reverse(nums, i + 1, n - 1)

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1

