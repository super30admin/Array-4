# Time Complexity : O(n)[n = length of nums list]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:return
        n = len(nums)
        i = n-2

        # check if there is any breach
        while i>=0 and nums[i] >= nums[i+1]:
            i-=1
        
        if i>=0:
            j = n-1
            while nums[j] <= nums[i]:
                j-=1
            nums[i], nums[j] = nums[j], nums[i]
            
        def reverse(start, end):
            while start < end:
                nums[start], nums[end] = nums[end], nums[start]
                start+=1
                end-=1
        reverse(i+1, n-1)