"""
Brute Force: generate all the substrings and find the max total.

Approach2: Sliding window.
TC: O(n)
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currSubArraySum = nums[0]
        maxSubArraySum = nums[0]

        for num in nums[1:]:
            # current sub array is either the previous subarry extended with curr number
            # or the current number
            currSubArraySum = max(currSubArraySum + num, num)

            # max sum is either previous or the number got by currSubArraySum
            maxSubArraySum = max(maxSubArraySum, currSubArraySum)

        return maxSubArraySum