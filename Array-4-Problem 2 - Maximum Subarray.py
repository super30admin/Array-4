"""
FAANMG Problem #124 {Medium} 

53. Maximum Subarray

Time Complexity O(n)
Space Complexity:  O(1)

Did this code successfully run on Leetcode : Yes



@name: Rahul Govindkumar
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int: 
        
        n = len(nums)
        
        # initialize current sum to first element of the array
        currSum = nums[0]   
        # initialize maximum sum to first element of the array
        maxV = nums[0]      
        
        for i in range(1, n):
            
            # check if adding the current element to the current sum 
            # gives a greater sum than the current element itself
            currSum = max( currSum + nums[i] , nums[i])    
            
            # check if the maximum sum seen so far is greater than the current sum
            maxV = max(maxV , currSum)     
            
        return maxV    # return the maximum sum found
        
        
        
class Solution:
    def maxSubArray(self, nums: List[int]) -> int: 
        
        # length of the input array
        n = len(nums)
        # initial value of the current sum and maximum value
        currSum = nums[0]
        maxV = nums[0]
        # starting and ending index of the maximum sum subarray
        left = 0
        right = 0
        # starting index of the current sum subarray
        start = 0
        # loop through the array and update the values
        for i in range(1, n):

            # check if it is better to start a new subarray from the current index or continue with the current one
            if currSum + nums[i] < nums[i]:
                start = i
                currSum = nums[i]
            else:
                currSum += nums[i]

            # check if the current sum is better than the maximum sum so far and update the maximum sum and its indices
            if maxV < currSum:
                left = start
                right = i
                maxV = currSum

        # return the maximum sum of contiguous subarray
        return maxV