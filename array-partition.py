"""
Runtime Complexity: O(n log n) - where 'n' is the number of elements in the list. We sort the list and we go over alternate numbers to compute the 
maximum sum.
Space Complexity: O(1) - no extra space is required to compute the solution.
Yes, the code worked on leetcode.
Issues while coding - Np
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums = sorted(nums)
        sum = 0
        for i in range(0,len(nums)-1,2):
            sum = sum+nums[i]
        return sum
            
        