#Time Complexity: O(n), as we iterate through the array once.
#Space Complexity: O(1), since no additional space is used apart from a few variables.
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        currSubArraySum = nums[0]
        maxSubArraySum = nums[0]
        for i in range(1,n):
            currSubArraySum = max(currSubArraySum+nums[i],nums[i])
            maxSubArraySum = max(currSubArraySum, maxSubArraySum)
        return maxSubArraySum
        