"""
Runtime Complexity:
O(n) -  we use two variables rsum and max and we traverse over 'n' elements in the given array .
Space Complexity:
O(1) - no extra data structure was used for computing the solution.
Yes, the code worked on leetcode.
Issues while coding -NO
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]
        rsum = nums[0]
        max_ = nums[0]
        for i in range(1,len(nums)):
            rsum = max(rsum+nums[i],nums[i])
            max_ = max(rsum,max_)
        return max_
        


