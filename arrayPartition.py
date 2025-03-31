"""
Approach --
1. sort the array
2. run for loop from 0 to n by incrementing i by 2
3. calculate sum of every 0 to i+2nd element
4. return sum

TC - O(n log n)
SC - O(1)
"""


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0: return 0

        nums.sort()
        n = len(nums)
        rtnData = 0

        # move i by 2 since we are sorting in asc order
        # and picking the lowest of the two adjacent integers
        for i in range(0, n, 2):
            rtnData += nums[i]

        return rtnData