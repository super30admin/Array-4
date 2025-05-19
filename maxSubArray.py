class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        Approach:
        1. Use Kadane's Algorithm to find the maximum sum of a contiguous subarray.
        2. Maintain two variables:
           - currSum: the sum of the current subarray
           - maxSub: the maximum subarray sum found so far
        3. If currSum drops below 0, reset it to 0 since any negative sum would reduce future total.
        4. At each step, update maxSub with the maximum of itself and currSum.

        Time Complexity: O(n) — Traverse the array once.
        Space Complexity: O(1) — Constant space used.
        """
        maxSub = nums[0]
        currSum = 0

        for num in nums:
            if currSum < 0:
                currSum = 0
            currSum += num
            maxSub = max(maxSub, currSum)
        
        return maxSub
