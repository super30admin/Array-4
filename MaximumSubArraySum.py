from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr = nums[0]
        maxSum = nums[0]
        start = 0
        end = 0
        startCurr = 0

        for i in range(1, len(nums)):
            curr += nums[i]
            if curr < nums[i]:
                startCurr = i
                curr = nums[i]

            if maxSum < curr:
                start = startCurr
                end = i
                maxSum = curr
        # print(nums[start:end+1])
        return maxSum