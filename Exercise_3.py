#S30 Problem #125 next permutation
#LeetCode #31 https://leetcode.com/problems/next-permutation/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# find a switch: 1st decreasing num from right(smaller, greater num), mark that index
# swap number at that index with the next greatest in remaining sub array (index to n)
# reverse the sub array(index+1 to end)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        # first decreasing element from right
        # need nums[i] < nums[i+1]
        while i >=0 and nums[i] >= nums[i+1]:
            i -= 1

        # if we find the switch, find next greatest number in sub array nums[i:n]
        if i >= 0:
            j = n-1
            while nums[i] >= nums[j]:
                j -=1
            # swap
            nums[i], nums[j] = nums[j], nums[i]
        
        # reverse the sub array
        # self.reverse(nums, i+1, n-1)
        left = i+1
        right = n-1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left +=1
            right -=1

'''
    # reverse works but while funtion is more efficient
    def reverse(self, nums, left, right):
        if left > right:
            return
        temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
        self.reverse(nums, left+1, right-1)
'''