# Time Complexity : O(n)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        maxS = nums[0]
        S = maxS
        for i in range(1, n):
            maxS = max(nums[i]+maxS, nums[i])
            if maxS > S:
                S = maxS

        return S

