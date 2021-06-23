class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0: return -1
        rsum = nums[0]
        maxsum = nums[0]
        for idx in range(1, len(nums)):
            rsum = max(rsum + nums[idx], nums[idx])
            maxsum = max(maxsum, rsum)
        return maxsum
