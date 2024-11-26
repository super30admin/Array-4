# 53. Maximum Subarray
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currMaxSum = nums[0]
        maxSubArrSum = nums[0]
        n = len(nums)
        currStart = 0
        maxStart = 0

        if n == 1:
            return nums[0]

        for i in range(1,n):
            currMaxSum = currMaxSum + nums[i]
            if nums[i] > currMaxSum: 
                currStart = i
                currMaxSum = nums[i]

            if maxSubArrSum < currMaxSum:
                maxStart = i 
                maxSubArrSum = currMaxSum

        return maxSubArrSum

            


        




        