#Time:O(nlogn)
#Space:O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        sorted(nums)
        return sum(nums[::2])