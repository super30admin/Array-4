# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I fumbled with the equal to, that is need to decrement even if it is equal
# Your code here along with comments explaining your approach

# starting from the end of the array, check if nums[i] < nums[i+1], if so this is a breach at i
# then find the number just bigger than nums[i] and replace nums[i] with that number
# then swap the remaining numbers from the breach element onwards


class Solution:

    def nextPermutation(self, nums):

        def swap(nums, i, j):
            
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        
        def reverse(nums, start, end):

            while start < end:
                swap(nums, start, end)
                start += 1
                end -= 1

        if nums is None or len(nums) == 0:
            return
        n = len(nums)

        # find the breach
        i = n - 2
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
        
        # find the digit to replace the ith number

        if i >= 0:
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            swap(nums, i, j)
        reverse(nums, i+1, n-1)