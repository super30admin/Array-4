
# 561. Array Partition

# // Time Complexity : O(nlogn) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No




class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort() # sorting the arrayPairSum / O(nlogn)
        maxSum = 0
        for i in range(0,len(nums),2): # numbers in even position should give the max / O(n)
            maxSum = maxSum + nums[i]
        return maxSum