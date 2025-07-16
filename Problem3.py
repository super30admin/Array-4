"""
Implemented using Kadane's Algorithm. Initialized maxSum with the first element and currSum with 0. If currSum becomes negative, reset it to 0; then add the current number. Update maxSum with the maximum of maxSum and currSum at each step.
Time Compelxity: O(n)
Space Compelxity: O(1)
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxSum = nums[0]
        currSum = 0
        for num in nums:
            if currSum < 0:
                currSum = 0
            currSum += num
            maxSum = max(maxSum, currSum)
        return maxSum  
    

# follow up to get the actual subarray
# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:

#         maxSum = nums[0]
#         currSum = 0

#         start = 0
#         end = 0
#         tempStart = 0

#         for i, num in enumerate(nums):
#             if currSum < 0:
#                 currSum = 0
#                 tempStart = i

#             currSum += num

#             if currSum > maxSum:
#                 maxSum = currSum
#                 start = tempStart
#                 end = i

#         print("Maximum subarray:", nums[start:end+1])