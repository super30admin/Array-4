class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        currSubArr = nums[0]
        maxSubAr = nums[0]

        for i in range(1, n):
            currSubArr = max(nums[i], currSubArr + nums[i])
            maxSubAr = max(maxSubAr, currSubArr)

        return maxSubAr