# Time Complexity : O(n) because we are iterating through the array
# Space Complexity : O(1) because we are not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
We iterate through the array and keep the increasing the size of the subarray until we find that that subarray sum is less than 0
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum = subarray = nums[0]

        for i in range(1,len(nums)):
            subarray = max(nums[i], subarray + nums[i])
            maxsum = max(maxsum, subarray)

        return maxsum 