# Time Complexity: O(n)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        if not n:
            return 0
        rsum = nums[0]
        msum = nums[0]
        for i in range(1, n):
            rsum = max(rsum + nums[i], nums[i])
            msum = max(rsum, msum)
        return msum