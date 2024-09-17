# Time Complexity : O(n)
# Space Complexity: O(n)
# Approach to solve the problem : Given below

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = nums[0]                   # Initializing runing sum and maximum as 0
        rsum = nums[0]
        
        for i in nums[1:]:
            rsum = max(i , rsum+i)          # Comparing the previous element and curr ele
            max_sum = max(max_sum,rsum)
                    
        return max_sum                      # Return the output
                
            
        