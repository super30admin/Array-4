# Time:O(n)
# Space:O(1)
# Leetcode: yes
# Issues:No 

# Saves indices
class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        n = len(nums)
        currSum = nums[0]
        maxSum = nums[0]
        start, end = 0,0        # indexes for max sum subarray
        currStart = 0           # index for curr sum subarray

        for i in range(1,n):                        # [3,-2,4]
            if currSum + nums[i] < nums[i]:         # (3-2+4 or 4) if 4?
                currStart = i
            currSum = max(currSum + nums[i], nums[i])
            
            if currSum > maxSum:                    # found a new maximum?
                start = currStart
                end = i
            maxSum = max(maxSum, currSum)
        return maxSum
    

# Indices Don't matter
class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        maxSum = float("-inf")
        currSum = 0

        for num in nums:
            currSum += num
            if currSum > maxSum:
                maxSum = currSum
            if currSum < 0:             # negative curr? reset to 0
                currSum = 0
        return maxSum