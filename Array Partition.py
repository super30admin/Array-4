# time complexity is o(nlog(n)), where n is the size of the input
# space complecity is o(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        for i in range(0, len(nums), 2):
            res += nums[i]
        return res