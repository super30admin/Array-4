#Time Complexity -- O(N)
#Space Complexity -- O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        if not nums:
            return 0
            
        curr = float(-inf)
        maxVal = float(-inf)
        
        for val in nums:
            curr = curr+val
            curr = max(curr, val)
            maxVal = max(curr, maxVal)
            
        return maxVal
                
        
