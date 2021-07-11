"""53. Maximum Subarray
TC - O(N)
SC - O(1)"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums)==0:
            return 0
        
        curr_sum = 0
        max_sum = float('-inf')
        
        for ele in nums:
            curr_sum = max(curr_sum +ele, ele)
            max_sum = max(curr_sum, max_sum)
          
        return max_sum