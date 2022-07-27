""""// Time Complexity : O(nlog(n))
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        result = 0
        nums.sort()

        for i in range(0, len(nums) - 1, 2):
            result += nums[i]
        return result
