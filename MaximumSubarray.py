# TC: O(N) as we will be iterating over each element once and calculating the cumulative sum at each index. 
# SC: O(1) since we do not use any extra space.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        total = nums[0]
        max_sum = nums[0]
        
        for i in range(1,len(nums)):
            max_sum = max(nums[i], max_sum + nums[i])
            total = max(total, max_sum)
        return total
