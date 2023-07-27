"""
Problem : 2

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Initilization a variable for storing current running sum and the maximum sum achieved, ietarting over the array
checking which would be better choice among including the next number in the subarray or starting the subarray from that number
based on the the sum of current sum and next number or next number itself, updating current sum after the decision and updating the
maximum sum of subarray encountered
"""

# Maximum Subarray

# Approach - 1
# Running Sum

class Solution(object):
    def maxSubArray(self, nums):
        currSum=nums[0]
        maxx=nums[0]
        for i in range(1,len(nums)):
            currSum=max(currSum+nums[i],nums[i])
                
            maxx=max(currSum,maxx)


        return maxx
    

# Approach - 2
# To find the actual subarray

class Solution(object):
    def maxSubArray(self, nums):
        currSum=nums[0]
        maxx=nums[0]
        start=0
        end=0
        startCurr=0
        for i in range(1,len(nums)):
            currSum=currSum+nums[i]
            if currSum<nums[i]:
                currSum=nums[i]
                startCurr=i
            
                
            if maxx<currSum:
                maxx=currSum
                start=startCurr
                end=i

        print(start,end)
        return maxx