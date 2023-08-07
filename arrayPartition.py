# Time Complexity : O(nlogn)
#Space Complexity : O(1)
# #// Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :NO
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum1 = 0
        for i in range(0,len(nums),2):
            sum1 += nums[i]
        return sum1
