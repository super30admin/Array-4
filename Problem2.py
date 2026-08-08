## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Solution 1: Sliding/Two-Pointer Logic
        #
        # Time Complexity: O(N)
        # - We traverse the list with 'start' and 'end' pointers. Each index is visited 
        #   a constant number of times, resulting in a single linear pass over the array.
        #
        # Space Complexity: O(1)
        # - Uses a fixed set of scalar variables (maxSum, start, end, curr, n), 
        #   requiring no additional memory allocation proportional to the input size.

        maxSum = nums[0]
        start, end = 0, 1
        curr = nums[0]
        n = len(nums)

        if n == 1:
            return nums[0]

        while start < n and end < n:
            # Calculate what the sum would be if we include the element at 'end'
            temp = curr + nums[end]

            # Logic: If extending the current subarray yields a larger value than starting 
            # a new subarray at 'end' alone, keep extending.
            if temp > nums[end]:
                curr = temp
            else:
                # If adding the current sum degrades or offers no value over nums[end],
                # reset the starting position to 'end' and restart the current running sum.
                start = end
                curr = nums[start]


            end += 1
            # Track the global maximum subarray sum encountered so far
            maxSum = max(curr, maxSum)

        return maxSum



        # Solution 2: Dynamic Programming / Kadane's Algorithm
        #
        # Time Complexity: O(N)
        # - Iterates through the array exactly once in a single 'for' loop.
        #
        # Space Complexity: O(1)
        # - Operates entirely in-place using two scalar variables ('curr' and 'maxSum').

        # Initialize maxSum to negative infinity to handle arrays containing only negative numbers
        maxSum = float('-inf')
        curr = 0

        for num in nums:
            # Logic: At each element, decide whether to append 'num' to the existing running 
            # subarray sum (curr + num) or discard the previous sum and start fresh with 'num'.
            # If (curr + num) < num, it means the previous running sum was negative and was 
            # dragging down the overall sum.
            curr = max(curr + num, num)

            # Update the global maximum sum found across all valid subarrays
            maxSum = max(maxSum, curr)

        return maxSum