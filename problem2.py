"""
At each position, we have to choose between either adding current number to the previous number or creating a new one from now, since there are negative numbers present, we 
can drop negative sum elements this way. 
TC is O(n) SC is O(1)
"""


class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        curr = nums[0]
        best = nums[0]

        for i in nums[1:]:
            curr = max(i, curr + i)
            best = max(curr, best)
        return best