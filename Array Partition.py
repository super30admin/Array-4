class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        summ = 0
        nums.sort()
        for i in range(0, len(nums), 2):
            summ += nums[i]

        return summ
