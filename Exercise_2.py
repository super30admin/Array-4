#S30 Problem #124 Maximum Subarray
#LeetCode #53 https://leetcode.com/problems/maximum-subarray/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# running sum/ presum solution
# calculate the running sum and update it if the current number (nums[i]) is greater than the running sum
# maintain a global max for running sum and return
# time complexity O(n)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxrsum = nums[0]
        rsum = nums[0]
        for i in range(1,len(nums)):
            # if current number is greater update it
            rsum = max(rsum + nums[i], nums[i])
            if maxrsum < rsum:
                maxrsum = rsum
        return maxrsum
