# Time Complexity : O(N) for each operation.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to find the currsum and its curr max value and return max value.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currsum=0
        mx=-99999
        for i in nums:
            currsum=max(currsum+i, i)
            mx=max(mx, currsum)
        return mx