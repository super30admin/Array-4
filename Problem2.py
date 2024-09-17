"""
53. Maximum Subarray
Time Complexity - O(n)
Space Complexity - O(1)
Here we add number to current sum and then we take max of number added sum or current number and then compare the max element with current sum of subarray selected.
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        current_sum = 0
        max_sum = float("-INF")
        for i in range(len(nums)):
            current_sum = max(current_sum+nums[i],nums[i])
            max_sum = max(max_sum,current_sum)
        return max_sum