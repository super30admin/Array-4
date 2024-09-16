"""
Time Complexity : O(nlogn) where n is the length of numbers
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        sum1 = 0
        # Sorting the numbers first so that every other number is minimum from pair
        # We then loop through sorted array and calculate the sum
        nums.sort()
        for i in range(0, len(nums), 2):
            sum1 += nums[i]
        return sum1