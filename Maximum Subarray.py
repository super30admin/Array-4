""""// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        currSum = nums[0]
        maxi = nums[0]
        start = 0
        end = 0
        currStart = 0

        for i in range(1, len(nums)):
            if nums[i] > currSum + nums[i]:
                currSum = nums[i]
                currStart = i
            else:
                currSum = currSum + nums[i]

            if currSum > maxi:
                maxi = currSum
                start = currStart
                end = i

        print(start)
        print(end)
        return maxi