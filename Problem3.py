# // Time Complexity : O(n) where n is the length of the nums list.  
# // Space Complexity : O(1).
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Class Solution.
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(nums,i,j):
            while(i<j):
                nums[i],nums[j] = nums[j],nums[i]
                i += 1
                j -= 1
                
        n = len(nums)
        if n == 0:
            return
        i = n - 2
        while(i>=0 and nums[i+1] <= nums[i]):
            i-=1
        if i >=0:
            j = n - 1
            while(j>=0 and nums[j] <= nums[i]):
                j -= 1
            nums[i],nums[j] = nums[j],nums[i]
        reverse(nums,i+1,n-1)
