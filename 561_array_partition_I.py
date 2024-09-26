from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """
            https://leetcode.com/problems/array-partition-i/
            Time Complexity - O(nlogn)
            Space Complexity - O(1)
            'n' is the length of nums
        """
        nums.sort()
        pairs = []
        for i in range(0, len(nums), 2):
            pairs.append(nums[i])
        return sum(pairs)
