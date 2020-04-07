# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums == None or len(nums)==0:
            return 0
        
        maxsubarray = [0]*(len(nums)+1)
        maxsubarray[0] = 0
        maxvalue = float('-inf')
        for i in range(1,len(maxsubarray)):
            
            maxsubarray[i] = max(maxsubarray[i-1]+nums[i-1], nums[i-1])
            maxvalue = max(maxvalue, maxsubarray[i])
            
        return maxvalue
            
            
        
            
        