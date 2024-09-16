# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums == None or len(nums)==0:
            return 0
        
        globalMax = float('-inf')
        runningSum = 0
        
        for i in range(len(nums)):
            runningSum = max(nums[i],runningSum+nums[i])
            globalMax = max(globalMax,runningSum)
            
        return globalMax
            
        
            
        
            
        
            
        