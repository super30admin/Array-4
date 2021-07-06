class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        n = len(nums)
        curr = nums[0]
        max_val = nums[0]
        for i in range(1, n):
            curr = max(nums[i], curr+nums[i])
            max_val = max(max_val, curr)
        return max_val
