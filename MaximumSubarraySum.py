class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        # Brute Force
        max_sum = -math.inf
        for i in range(len(nums)):
            curr_sum = 0
            for j in range(i, len(nums)):
                
                curr_sum += nums[j]
                
                max_sum = max(max_sum, curr_sum)
                
        return max_sum
                
    # TC: O(n^2)
        
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Optimal DP using Kadene's Algorithm
        
        curr_sum = 0
        max_sum = -math.inf
        
        for i in range(len(nums)):
            curr_sum = max(curr_sum + nums[i], nums[i])
            max_sum = max(max_sum, curr_sum)
            
        return max_sum
    
    # TC: O(n) solution
    # SC: O(1)
                