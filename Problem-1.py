# Time Complexity :O(nlogn)
# Space Complexity :O(1) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sol = 0
        #sort
        nums.sort()
        for i in range(0,len(nums),2):
            # sum all in even positions
            sol += nums[i]
        return sol