# Approach: Kadane's algorithm
# Time - O(N)
# Space - O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        if not nums or len(nums) == 0:
            return 0
        
        current_sum = max_sum =  nums[0]
        
        
        for num in range(1, len(nums)):
            current_sum = max(current_sum + nums[num], nums[num])
            max_sum = max(current_sum, max_sum)
            
            
        return max_sum