# Time Complexity: O(N)
# Space Complexity: O(1)
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        current_max_sum = nums[0]
        max_sum = nums[0]
        if len(nums) == 1:
            return nums[0]
        for i in range(1,len(nums)):
            current_max_sum = max(nums[i], current_max_sum + nums[i])
            max_sum = max(max_sum, current_max_sum)
        return max_sum