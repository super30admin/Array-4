# // Time Complexity : O(n) where m,n are the number of rows,cols of the matrix
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach 
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxCur = float('-inf')
        maxSoFar = float('-inf')
        
        for i in range(len(nums)):
            maxCur = max(nums[i],nums[i]+maxCur)
            maxSoFar = max(maxSoFar,maxCur)
        return maxSoFar