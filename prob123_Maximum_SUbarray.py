#Time Complexity :o(n)
# Space Complexity :o(1)


        class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if max(nums)<0:
            return max(nums)
        curr_sum, max_sum = 0, 0
        for num in nums:
            curr_sum = max(0, curr_sum + num)
            max_sum = max(curr_sum, max_sum)
        return max_sum