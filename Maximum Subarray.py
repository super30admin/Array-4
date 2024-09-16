# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = (-float("inf"),0,0)
        
        s_sum = -float("inf")
        l = r = 0
        
        while r < len(nums):
            if s_sum > res[0]:
                if r == 0:
                    res = (s_sum, l, 1)
                else:
                    res = (s_sum, l, r)
            if nums[r] + s_sum >= nums[r]:
                s_sum += nums[r]
            else:
                s_sum = nums[r]
                l = r
            r+= 1
        if s_sum > res[0]:
            if r == 0:
                r += 1
            res = (s_sum, l, r)
        return res[0]