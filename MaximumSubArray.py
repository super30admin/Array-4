------------------------Maximum sub array start and end pointers of array--------------------------------------------

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
#Here same as previous problem, I will have a running sum, and check if my nums[i] is greater than rSum
# I will change my k value, and update the rSum. If my rSum is greater than res, then i will update start , end and res

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        start = 0
        end = 0
        k =0
        res = float('-inf')
        rSum = 0
        for i in range(len(nums)):
            rSum = rSum+nums[i]
            if nums[i]>rSum:
                k = i
                rSum = nums[i]
            
            if rSum > res:
                start = k
                end = i
                res = rSum

        return res
        
-----------------------Maximum sub array--------------------------------------------
# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have 2 choices , either I can choose the number at index or i can start my array from next element. 
# so at every index I will have a max (previous sum and the current number). that will be my lglobal max
# I will start these max values in dp array and get max(dp) at last

    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        dp = [0 for i in range(len(nums))]
        dp[0] = nums[0]
        
        for i in range(1, len(nums)):
            dp[i] = max(dp[i-1]+nums[i], nums[i])
        
        return max(dp)