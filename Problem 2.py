class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        kadane's algo

        """
        maxx = -10000
        cursum = 0

        for i in range(len(nums)):
            cursum += nums[i]
            maxx = max(maxx, cursum)

            if cursum < 0:
                cursum = 0
        
        return maxx
