# Time Complexity : O(n)
# Space Complexity : O(1)
# Approach :
# We iterate the array and keep track of the current sum of the subarray.
# If at any point the current sum becomes less than the current element, we reset the current sum to the current element.
# We also keep track of the maximum sum encountered so far.
# If the current sum exceeds the maximum sum, we update the maximum sum.
class Solution:
    def maxSubArray(self, nums):
        maxSum = float("-inf")
        currSum = 0
        for i in range(len(nums)):
            currSum = currSum + nums[i]
            if nums[i] > currSum:
                currSum = nums[i]
            maxSum = max(maxSum, currSum)

        return maxSum

# Time Complexity : O(n)
# Space Complexity : O(1)
# Approach:
# We iterate through the array and keep track of the current sum of the subarray.
# We also keep track of the start and end indices of the maximum subarray found so far.
# If the current sum becomes less than the current element, we reset the current sum to the current element and update the start index.
# # If the current sum exceeds the maximum sum, we update the maximum sum and the end index.   
class Solution:
    def maxSubArray(self, nums):
        maxSum = float("-inf")
        currSum = 0
        start = 0
        end = 0
        currStart = 0
        for i in range(len(nums)):
            currSum = currSum + nums[i]
            if nums[i] > currSum:
                currSum = nums[i]
                currStart = i
            if currSum > maxSum:
                start = currStart
                end = i
                maxSum = currSum

        print(start, end)
        return maxSum