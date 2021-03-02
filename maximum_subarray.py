# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
# I keep running sum and whenever the running sum increses max running sum, I update the max running sum. If running sum goes below 0 I start a new running sum

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        ans = -math.inf, 0, 0
        
        start = 0

        rSum = 0
        
        for i in range(0, len(nums)):
            rSum += nums[i]
            
            if rSum > ans[0]:
                ans = rSum, start, i+1
                
            if rSum < 0:
                rSum = 0;
                start = i+1
             
        print(nums[ans[1]: ans[2]])
        return ans[0]
