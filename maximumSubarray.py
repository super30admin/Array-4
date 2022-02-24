#O(n) solution
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        
        runningSum = nums[0]
        maximum = nums[0]
        
        for i in range(1, len(nums)):
            runningSum = max(runningSum + nums[i], nums[i])
            maximum = max(maximum, runningSum)
        return maximum