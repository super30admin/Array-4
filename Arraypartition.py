# Time Complexity : O(n log n)
# Space Complexity : O(1)

class Solution:
    def arrayPairSum(self, nums):
        n = len(nums)
        nums.sort()
        res = 0

        for i in range(0, n, 2):
            res += nums[i]

        return res