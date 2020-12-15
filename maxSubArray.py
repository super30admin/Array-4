#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        maxSum = nums[0]
        currSum = nums[0]
        for num in nums[1:]:
            currSum = max(num, currSum+num)
            maxSum = max(maxSum, currSum)

        return maxSum
