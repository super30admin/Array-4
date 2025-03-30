# Time O(n)
# Space O(1)
import math
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currMax = -math.inf
        maxSum = -math.inf
        for i in range(len(nums)):
            currMax = max(currMax + nums[i], nums[i])
            maxSum = max(maxSum, currMax)
        return maxSum

# printing indices of min SubArray of maxSum
import math
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currMax = -math.inf
        maxSum = -math.inf
        start = 0
        end = 0
        for i in range(len(nums)):
            newSum = currMax + nums[i]
            if newSum < nums[i]:
                start = i
                end = i
                currMax = nums[i]
            else:
                if newSum > maxSum:
                    end = i
                    maxSum = newSum
                currMax = newSum
            maxSum = max(currMax, maxSum)
        print(start, end)   
        return maxSum


