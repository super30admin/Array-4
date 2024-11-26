# 561. Array Partition
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums_sorted = sorted(nums)
        n = len(nums)
        result = 0

        for i in range(0,n,2):
            result += nums_sorted[i]

        return result