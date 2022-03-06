# // Time Complexity : O(nlogn) where n is the length of the nums list.  
# // Space Complexity : O(1) .
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Class Solution.
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        l = len(nums)
        if l < 2:
            return 0
        if l == 2:
            return min(nums[0],nums[1])
        sum = 0
        for i in range(0,len(nums),2):
            sum += nums[i]
        return sum
