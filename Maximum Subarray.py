# time complexity is o(n), where n is the size of the input
# space complexity is o(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currSum = 0
        maxi = float('-inf')
        start = 0 # start index
        end = 0 # end index
        for i in range(len(nums)):
            if(nums[i] > currSum + nums[i]):
                currSum = nums[i] 
                start = i
            else:
                currSum += nums[i]
            if(currSum > maxi):
                maxi = currSum
                end = i
        print(start, end)   # printing starting and ending index of the subarray
        return maxi
        
      
        
        
        
#         currsum = 0
#         maxsum = float('-inf')
        
#         for i in nums:
#             currsum += i
#             if(currsum < i):
#                 currsum = i
#             if(currsum > maxsum):
#                 maxsum = currsum
#         return maxsum
        
       
            
            
        