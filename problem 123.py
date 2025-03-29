#  https://leetcode.com/problems/array-partition/

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        i = 0
        ans = 0
        while(i<n):
            ans += nums[i]
            i+=2
        return ans