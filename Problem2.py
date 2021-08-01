# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#saving the previous minimum currsum and keeping track of the difference between the 
#current running sum and previous minimum to obtain the maximum
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxDiff = -999999999999999999999999
        contSum = 0
        leastSum = 9999999999999999999999999
        
        for i in range(len(nums)):
            dummy = contSum
            contSum += nums[i]
            
            leastSum = min(leastSum,dummy)
            
            maxDiff = max(maxDiff,contSum - leastSum,contSum)
        
        return maxDiff
        