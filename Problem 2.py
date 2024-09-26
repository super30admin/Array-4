# Time: O(n)
# Space: O(1)
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        curr_sum = 0
        ans = -1000000007
        for i in range(0, len(nums)):
            curr_sum += nums[i]
            ans = max(ans, curr_sum)
            if curr_sum < 0:
                curr_sum = 0
        return ans
        
        
