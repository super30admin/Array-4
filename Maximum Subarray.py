class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # O(n) time O(1) space DP solution
        max_sub = nums[0]
        curr_sub = nums[0]
        for i in range(1,len(nums)):
            curr_sub = max(nums[i], curr_sub+nums[i])
            max_sub = max(max_sub,curr_sub)
        return max_sub