"""
Time : O(N)
Time : O(1)
Leetcode : Yes
Problems : No
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        currSum = nums[0]
        maxSum = nums[0]
        for i in range(1, len(nums)):
            # start new window or continue old one
            currSum = max(currSum + nums[i] , nums[i])
            maxSum = max(maxSum, currSum)
            
        return maxSum
        