"""
We want to maximize the min number of the pair, brute force would be to explore every pair and then check but a optimal way would be to cleverly make pairs such that we can
have control over the positions of the min numbers of the pair, this way we can sort the nums and then add them at a distance of 2 steps, so every other number can be the minimun of that
pair. TC is O(n) and SC is O(1)
"""

class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        nums.sort()
        for i in range(0, len(nums), 2):
            res += nums[i]
        return res
        