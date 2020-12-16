#As taught in class using sliding window to solve this problem
#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums)==0:
            return
        rSum = nums[0]
        maxi = nums[0]
        for i in range(1,len(nums)):
            rSum = max(nums[i],rSum+nums[i])
            maxi = max(maxi,rSum)
        return maxi