"""
Time Complexity : O(n) where n is no. of elements in the array
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        # Store running sum
        rSum = nums[0]
        # Store maximum sum seen
        maxi = nums[0]
        # We loop through nums to check the maximum between current number and the 
        # running sum that we calculate by adding old running sum and current no.
        # After that we update our maxi to the maximum between old maximum and running
        # sum
        for i in range(1, len(nums)):
            rSum = max(rSum + nums[i], nums[i])
            maxi = max(rSum, maxi)
        return maxi