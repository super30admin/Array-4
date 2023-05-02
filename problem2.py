# TC - O(n)
# SC - O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        currSum = 0
        maxSum = nums[0]
        currS = 0 
        start = 0
        end = 0
        for i in range(len(nums)):
            currSum += nums[i]
            if currSum < nums[i]:
                currSum = nums[i]
                currS = i
            if maxSum < currSum: 
                maxSum = currSum 
                start = currS
                end = i
        print(start)
        print(end)

        return maxSum
           

           
               