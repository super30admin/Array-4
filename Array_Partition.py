# Time complexity : O(nlogn)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # sort the array
        nums.sort()
        n = len(nums)
        i = 0
        res = 0
        
        # traverse over the array and add the sum of all odd numbers as they would be the min out of a pair of given even numbers
        while i < n:
            res += nums[i]
            i += 2
        
        # return res
        return res
