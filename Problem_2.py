class Solution:
    def maxSubArray(self, nums):
        n = len(nums)
        maxSum = nums[0]
        currSum = nums[0]
        for right in range(1, n):
            if currSum + nums[right] > nums[right]:
                currSum += nums[right]
            else:
                currSum = nums[right]
            if currSum > maxSum:
                maxSum = currSum

        return maxSum
