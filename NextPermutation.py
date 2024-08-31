#// Time Complexity : O(N) 
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No.


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ind = -1
        for i in range(len(nums)-2,-1,-1):
            if nums[i] < nums[i+1]:
                ind = i
                break
        if ind == -1:
            nums.reverse()
            return

        for i in range(len(nums)-1,ind,-1):
            if nums[i] > nums[ind]:
                nums[i],nums[ind] = nums[ind],nums[i]
                break
        
        nums[ind+1:] = reversed(nums[ind+1:])

# Approach:
# 1. Find the first decreasing element from the right, which is the pivot element. If no such
# element exists, it means the current permutation is the last permutation, so we reverse
# the array to get the next permutation.
# 2. Find the smallest element on the right side of the pivot element that is greater than the
# pivot element. Swap these two elements.
# 3. Reverse the subarray to the right of the pivot element to get the next permutation.
