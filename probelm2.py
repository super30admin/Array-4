# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        mxsum = nums[0]
        cusum = 0
        for num in nums:
            cusum += num
            cusum = max(cusum, num)
            mxsum = max(mxsum, cusum)
        return mxsum