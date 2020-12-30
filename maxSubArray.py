class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        return self.helper(nums, 0, len(nums)-1)
    
    def crossSum(self,num, left, right, middle):
        if left == right:
            return num[left]
        leftMax = float("-inf")
        leftSum = 0
        for i in range(middle, left-1, -1):
            leftSum+=num[i]
            leftMax = max(leftSum, leftMax)
        rightMax = float("-inf")
        rightSum = 0
        for i in range(middle+1, right+1, 1):
            rightSum+=num[i]
            rightMax = max(rightSum, rightMax)
        return leftMax+rightMax
            
        

    
    def helper(self,num, left, right):
        if left == right:
            return num[left]
         
        middle = left + (right-left)//2
        leftSum = self.helper(num, left, middle)
        rightSum = self.helper(num, middle+1, right)
        crossSum = self.crossSum(num, left, right, middle)    
        return max(leftSum, rightSum , crossSum)
    
    
Time: O(nlogn(n))
Space: O(log(n))

DP:
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        output = float("-inf")
        curr = nums[0]
        dp = [0]*len(nums)
        dp[0] = nums[0]
        for i in range(1,len(nums)):
            dp[i] = max(dp[i-1]+nums[i], nums[i])
            
            
        return max(dp)
Time: O(n)
Space: O(n) can be reduced to O(1)
    
