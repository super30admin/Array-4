#TC : O(nlogn) for sorting
#SC : O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        count = 0

        while count < len(nums):
            ans += nums[count]
            count += 2

        return ans