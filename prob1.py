# Time Complexity : O(nlogn)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        s = 0
        for i in range(0, len(nums), 2):
            s += nums[i]

        return s