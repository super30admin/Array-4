# Time:- O(n)
# Space:- O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        windowSum = nums[0]
        maxSum = nums[0]
        
        for i in range(1,len(nums)):
            windowSum = max(windowSum+nums[i], nums[i])
            maxSum = max(windowSum, maxSum)
        return maxSum