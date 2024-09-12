# // Time Complexity : O(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0

        rsum = nums[0]
        _max = nums[0]

        for i in range(1, len(nums)):
            rsum = max(rsum+nums[i],nums[i])
            _max = max(_max,rsum)

        return _max
