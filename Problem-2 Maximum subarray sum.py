class Solution:
    def maxSubArray(self, nums) :

        if nums == None or len(nums) == 0:
            return 0

        runSum = nums[0]
        maxSum = nums[0]

        for i in range(1, len(nums)):
            runSum = max(runSum + nums[i], nums[i])
            maxSum = max(maxSum, runSum)
        return maxSum