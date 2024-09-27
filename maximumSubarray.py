'''
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Find the running Sum of the element, create global variable which keeps track of the max seen so far.
Find min(runningSum , nums[i]) and save this to running sum, eg rsum = -2 but element is 1 so the new rsum will be 1
Update global variable globalMax to max(running sum, max) for the highest running sum seen so far.
'''


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        runningSum = 0
        globalMax = -math.inf

        for i in range(0,len(nums)):
            runningSum = max(nums[i],runningSum + nums[i])
            globalMax = max(globalMax, runningSum)

        return globalMax