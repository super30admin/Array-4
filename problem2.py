#Time Complexity : O(n) iterating through the array
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to keep track of the current sum and the maximum sum. We iterate through the array and keep adding the current number to the current sum. If the current sum is less than the current number, we update the current sum to the current number. If the maximum sum is less than the current sum, we update the maximum sum to the current sum. We also keep track of the start and end of the subarray that gives the maximum sum. We return the maximum sum.
class Solution:
    
    def maxSubArray(self, nums: List[int]) -> int:
        start, end, startCurr = 0, 0, 0

        currSum = nums[0]
        maxSum = nums[0]

        for i in range(1, len(nums)):
            currSum += nums[i]

            if currSum < nums[i]:
                currSum = nums[i]
                startCurr = i

            if maxSum < currSum:
                maxSum = currSum
                start = startCurr
                end = i

        return maxSum