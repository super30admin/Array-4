# // Time Complexity : O(nlgn) where m,n are the number of rows,cols of the matrix
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach 
# Greedy solution - higher numbers won't be mixed with lower numbers and won't be sacrificed
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        maxSum = 0
        for i in range(1,len(nums),2):
            maxSum += min(nums[i-1],nums[i])
        return maxSum

