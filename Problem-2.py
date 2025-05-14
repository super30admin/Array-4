'''
    Time Complexity: O(n)
    Space Complexity: O(1)
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxSum = float("-inf")
        curSum = maxSum

        for num in nums:
            curSum = max(curSum + num, num)
            maxSum = max(maxSum, curSum)

        return maxSum