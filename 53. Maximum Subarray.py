# #Brute Force approach
# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
        
#         maxSum = 0
#         #Window approach (Two pointer approach)
#         if len(nums)==0:
#             return 0
#         for L in range(len(nums)):
#             currSum = 0             #Make currSum=0 everytime when left pointer iterates.
#             for R in range(L,len(nums)):
#                 currSum = currSum+nums[R]
#                 maxSum = max(currSum,maxSum)
#         return maxSum

# #Time Complexity = O(n^2) & Space complexity = O(1)



#Using Kadane's Algorithm
# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
#         currSum = 0
#         maxSum = 0
#         for i in range(len(nums)):
#             currSum = currSum + nums[i]
#             if(currSum > maxSum):
#                 maxSum = currSum
#             if(currSum<0):
#                 currSum = 0
#         return maxSum
#         # Here the problem is when the given array is negative
# Complexity : Space : O(1), Time : O(N)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        CurrSum = MaxSum = nums[0]
        for i in range(1,len(nums)):
            CurrSum = max(nums[i] , CurrSum+nums[i]) #Next element alone is better or sum is better
            MaxSum = max(CurrSum,MaxSum)
        return MaxSum
# Complexity : Space : O(1), Time : O(N)
