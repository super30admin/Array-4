# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def maxSubArray(self, nums):
        maxSum = float("-inf")
        currSum = 0
        for i in range(len(nums)):
            currSum = currSum + nums[i]
            if nums[i] > currSum:
                currSum = nums[i]
            maxSum = max(maxSum, currSum)

        return maxSum