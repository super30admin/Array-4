# Time Complexity : O(nlogn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        maxsum = 0
        for i in range(len(nums)):
            if i % 2 == 0:
                maxsum += nums[i]
        return maxsum