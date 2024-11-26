#TimeComplexity:O(N) 
#SpaceComplexity: constant space
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max1=nums[0]
        for i in range(1, len(nums)):
            nums[i]=max(nums[i-1]+nums[i],nums[i])#at each point take max of current elemet and sum of cur and prev element
            max1=max(max1,nums[i])
        return max1