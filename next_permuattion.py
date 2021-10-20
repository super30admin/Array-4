# // Time Complexity : O(n) where n is the length of teh array
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach  

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """        
        # for i in range(len(nums)-1,0,-1):
        i = len(nums)-1
        while i > 0 and nums[i] <= nums[i-1]:
            i -= 1
        if i == 0:
            nums.reverse()
            return
        
        j = len(nums)-1
        while j > i and nums[j] <= nums[i-1]:                       
            j -= 1
            
        if j >= 0 and nums[j] > nums[i-1]:
            nums[i-1],nums[j] = nums[j], nums[i-1]

        
        l = i # every number after i-1 to end of array will be a part of the reversal
        r = len(nums) - 1
        while l < r:
            nums[l],nums[r] = nums[r],nums[l]
            r -= 1
            l += 1
            