class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        T: O(N)
        S: O(1)
        """
        if not nums: return 0
        
        curr_sum = 0
        max_sum = float('-inf')
        
        for x in nums:
            curr_sum = max(x, curr_sum + x)
            max_sum = max(max_sum, curr_sum)
            
        return max_sum