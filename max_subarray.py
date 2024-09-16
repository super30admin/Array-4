#Time -> O(n)
#Space ->O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currSum=nums[0]
        maxSum=nums[0]
        
        
        for i in range(1,len(nums)):
            currSum=max(nums[i],currSum+nums[i])
            maxSum=max(maxSum,currSum)
        
        return maxSum



#To find the Start and end point
# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
#         currSum=maxSum=nums[0]
#         currStart=0
#         end=0
#         start=0
        
#         for i in range(len(nums)):
#             currSum=currSum+nums[i]
#             if currSum<nums[i]:
#                 currStart=i
#                 currSum=nums[i]
            
#             if maxSum<currSum:
#                 maxSum=currSum
#                 start=currStart
#                 end=i
        
#         print(start,end)
#         return maxSum
        