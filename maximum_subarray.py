"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
Algorithm Explanation
Here we follow the Kadane's algorithm which is basically based on the intuition
to keep a running sum of the array and only update the sum it if current value 
added to existing sum gives better value or else skip the value
THe maximum sum is tracked through the process and returned in the end
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Approach by Kadane's algorithm
        """
        Linear time solution - keeping track of maximum sum of previous occured subarray sum
        Dp aproach - O(n) space
        Non use of storage arry- O(1) space
        """
        if not nums:
            return 0
        if len(nums) == 1:
            return nums[0]
        max_sm = nums[0]
        end_sm = nums[0]
        # dp = [None]*len(nums)
        # dp[0] = nums[0]
        for i in range(1,len(nums)):
            #dp[i] = max(nums[i], dp[i-1] + nums[i])
            max_sm = max(nums[i], max_sm + nums[i])
            end_sm = max(end_sm,max_sm)
        
        return end_sm