#Time: O(n)
#Space: O(1)
#Program ran on leetcode successfully

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        maxSum = nums[0]
        currSum = nums[0]
        sIx = 0
        eIx = 0
        curr = 0 
        for i in range(len(nums)):
            currSum = currSum + nums[i]
            
            if currSum < nums[i]:
                curr = i 
                currSum = nums[i]
            
            if maxSum < currSum:
                maxSum = currSum
                sIx = curr
                eIx = i
        
        return maxSum
            
                
                
        
        