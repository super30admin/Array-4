#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)<2:
            return nums[0]
        currSum=nums[0]
        MaxSum=nums[0]
        for i in range(1,len(nums)):
            currSum=max(currSum+nums[i],nums[i])
            MaxSum=max(MaxSum,currSum)
        return MaxSum