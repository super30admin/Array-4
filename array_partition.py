class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        n = len(nums)
        nums.sort()

        result = 0

        for i in range(0, n, 2):
            result += nums[i]

        return result
        