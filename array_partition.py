# Time Complexity: O(nlogn)
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not len(nums):
            return 0
        nums.sort()
        res = 0
        for i in range(0,len(nums),2):
            res += nums[i]
        return res