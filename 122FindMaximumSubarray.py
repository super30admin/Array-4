"""
    // Time Complexity :O(n)
    // Space Complexity :O(1)
    // Did this code successfully run on Leetcode : YES
    // Any problem you faced while coding this : NA

    //Explanation:
    calculate runningSum at each index level. check if adding value at nums[i]
    in runningSum is > than individual nums[i].
    update maxSum if > runningSum
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # edge
        if len(nums) == 0 or nums is None: return

        maxSum = float('-inf')
        runningSum = 0

        for i in range(len(nums)):
            runningSum = max(nums[i],runningSum + nums[i])
            maxSum = max(runningSum,maxSum)
        return maxSum
