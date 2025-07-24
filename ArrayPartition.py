class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sums = 0
        r = len(nums) - 2
        while r >= 0:
            sums += nums[r]
            r -= 2
        return sums