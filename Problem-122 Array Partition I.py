# 561. Array Partition I
# https://leetcode.com/problems/array-partition-i/

# Logic: Sort yhe input, take alternate elements.

# Time Complexity: O(nlogn)
# Space Complexity: O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        
        for i in range(0, len(nums), 2):
            res += nums[i]
        return res