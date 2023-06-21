#53. Maximum Subarray


# // Time Complexity : O(n) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No



class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # running sum 
        n = len(nums)
        runingSum = nums[0] 
        currentSum = 0
        for i in range(0,n): # O(n)
            if nums[i] > currentSum and currentSum < 0:
                currentSum = nums[i]
            else:
                currentSum = currentSum + nums[i]
            if currentSum > runingSum:
                runingSum = currentSum
        # print(runingSum,currentSum)
        return runingSum