# Time Complexity :O(n)
# Space Complexity :O(1) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
class Solution(object):
    from sys import maxint
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # max sum subarray initialize to first in array
        ans = nums[0]
        #local max sum initialize
        maxsum = nums[0]
        #start loop from second pos
        for i in range(1,len(nums)):
            # is it better to have the number alone or add it to local sum
            maxsum = max(nums[i], maxsum+nums[i])
            # check if local is big than total max
            ans = max(ans,maxsum)
        #return total max
        return ans