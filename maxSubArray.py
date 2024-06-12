# TC : O(N)
# SC: O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        max_sum = -float("inf")
        ans = -float("inf")
        for num in nums:
            max_sum = max(num, max_sum + num)
            ans = max(max_sum, ans)
            
        return ans