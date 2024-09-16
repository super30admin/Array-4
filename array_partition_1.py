# Time: nlog(n) 
# Spce: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        max_sum = 0
        nums.sort()
        
        for i in range(0, len(nums)-1, 2):
            max_sum += nums[i]
            
        return max_sum