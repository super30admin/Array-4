#Time complexity: O(nlogn)
#Space complexity: O(1)
#Works on leetcdoe - yes
#Approach: First we find the location j where we need to exchange the elements, then we iterate through the nums and if any
#element is greater than nums[j], we exchange them. Finally we sort the nums from j to n-1.

class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return nums
        i,j = len(nums)-1, -1
        while i>0:
            if nums[i-1]<nums[i]:
                j=i-1
                break
            i-=1
        for a in range(len(nums)-1,-1,-1):
            if nums[a]>nums[j]:
                nums[a],nums[j]=nums[j],nums[a]
                break
        nums[j+1:] = sorted(nums[j+1:])
        