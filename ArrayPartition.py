# Time Complexity : O(NlgN) for each operation.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to add the every alternate value after sorting the given list.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums=sorted(nums)
        res=0
        for i in range(0, len(nums), 2):
            res+=nums[i]
        return res