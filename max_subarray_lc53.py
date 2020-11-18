"""
Time Complexity: O(n)
Space Complexity: O(1)

Logic: Kadane's algorithm - DP
if your current number is larger than the previous add it
always take max of current cummulative sum and current_max
No need to add the number if current number is negative,
it will further decrease the cummulative sum always.
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        
        n = len(nums)
        
        max_sum = nums[0]
        
        for i in range(1,n):
            if nums[i-1]>0:
                nums[i]+=nums[i-1]
            
            max_sum = max(nums[i],max_sum)
        
        return max_sum