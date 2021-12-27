# Did this code successfully run on Leetcode : YES

# TC: O(N log N)
# SC: O(1)

# sort and select alternating pairs

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        for i in range(0, len(nums), 2):
            res += nums[i]
        return res