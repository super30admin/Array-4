"""
Problem : 3

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Starting from the right end, and trying to find the breach in the order, a number which is smaller
than the previous number, marking that number as the breach, then again searching from the right end for
the number which is just smaller than the breach, swapping those two numbers, and reversing all the numbers
after the breach, if no breach found, then reversing the entire permutation

"""

# Next Permutation

class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return 
        n=len(nums)
        i=n-2

        def reverse(l,r):
            while l<r:
                temp=nums[l]
                nums[l]=nums[r]
                nums[r]=temp
                l+=1
                r-=1
                
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        j=n-1
        if i>=0:
            while nums[i]>=nums[j]:
                j-=1
            
            temp=nums[i]
            nums[i]=nums[j]
            nums[j]=temp
        else:
            reverse(0,n-1)
            return nums

        reverse(i+1,n-1)
        return nums