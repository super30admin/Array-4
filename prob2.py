# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

# keep a running sum and a current sum, 
# update current sum with max of current sum + nums[i] or nums[i]
# update maxsum with max of maxsum or currsum

class Solution:

    def maxSubArray(self, nums):

        if nums is None or len(nums) == 0:
            return 0
        
        currsum, maxsum = nums[0], nums[0]

        for i in range(1, len(nums)):

            currsum = max(currsum + nums[i], nums[i])
            maxsum = max(currsum, maxsum)
        
        return maxsum