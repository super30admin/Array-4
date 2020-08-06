------------------------ArrayPairSum --------------------------------------------

# Time Complexity : O(n log n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here we sort the numbers array, and take the minimum of adjacent element pairs and add  them to get maximum 
#summation.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        nums.sort()
        res = 0
        for i in range(0, len(nums), 2):
            res += nums[i]
        return res