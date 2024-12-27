# Explain your approach briefly at the top:
# Use Kadane's Algorithm to find the maximum subarray sum in O(n) time.
# Maintain a running sum and update the global maximum whenever the running sum exceeds it.
# If the running sum becomes negative, reset it to 0, as starting a new subarray is more beneficial.

# Time Complexity: O(n), where n is the length of nums, as we traverse the array once.
# Space Complexity: O(1), as we only use a few variables for computation.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Step 1: Initialize variables
        max_sum = float('-inf')  # To store the maximum subarray sum
        current_sum = 0  # To store the running sum of the current subarray

        # Step 2: Traverse the array
        for num in nums:
            current_sum += num  # Add the current number to the running sum
            max_sum = max(max_sum, current_sum)  # Update max_sum if current_sum is greater

            # Step 3: Reset current_sum to 0 if it becomes negative
            if current_sum < 0:
                current_sum = 0

        return max_sum
