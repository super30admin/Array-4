# Time is O(n)
# Space is O(1)
# The intuition is to loop through all the elements in nums and keep track of curr sum, if curr element is greater than curr sum then we can
# update the curr sum and then max value based on the curr sum.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxVal = nums[0]
        currSum = nums[0]
        start = 0
        currStart = 0
        end = 0
        for i in range(1, len(nums)):
            currSum += nums[i]
            if nums[i] > currSum:
                currSum = nums[i]
                currStart = i
            if maxVal < currSum:
                maxVal = currSum
                start = currStart
                end = i
        return maxVal