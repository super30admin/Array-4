class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # T: O(n), S: O(1)
        max_sum = float("-inf")
        current_sum = 0

        for num in nums:
            current_sum = max(num, current_sum + num)  # Include or start new subarray
            max_sum = max(max_sum, current_sum)  # Update global max

        return max_sum
