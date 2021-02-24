class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #Approach: Linear Traversal
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        
        currSum = maxSum = -inf
        for num in nums:
            currSum = max(currSum + num, num)
            maxSum = max(maxSum, currSum)
            
        return maxSum