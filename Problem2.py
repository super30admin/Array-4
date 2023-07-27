'''
Problem: Maximum Subarray
Time Complexity: O(n), where n is length of nums
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        at each element calculate currsum and maxsum
        for currsum, is currsum + element is better or element alone is better
        return maxsum at end 
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum = nums[0]
        currsum = nums[0]

        for i in range(1,len(nums)):
            currsum+=nums[i]
            currsum = max(currsum, nums[i])
            maxsum = max(maxsum, currsum)

        return maxsum
        