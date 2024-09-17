# Time - O(n)
# Space - O(n)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        dp = [0 for i in range(len(nums)+1)]
#         Take a DP table and keep filling the table with the maximum sum of the subarray
        
        dp[0] = nums[0]
        res = nums[0]
        
        for i in range(1,len(nums)):
            dp[i] = max(dp[i-1] + nums[i], nums[i])
            res = max(res,dp[i])
        # print(dp)
        return res
    
    
        

        
        
# Time - O(n)
# Space - O(1)
#         sol_max = float('-inf')
#         curr_max =  float('-inf')
        
        
#         for i in range(len(nums)):
#             curr_max = max(nums[i] + curr_max, nums[i])
            
#             sol_max = max(sol_max, curr_max)
            
#         return sol_max