"""
Time complexity: O(nlogn)
Space complexity: O(1)
Compiled on leetcode?: Yes
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result  