'''
Time Complexity :O(n) 
Space Complexity :O(1)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this :no
'''
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        # sort the nums
        nums.sort()
        
        # return the sum
        maxSum = 0
        
        # create the pairs and find the min of the pairs
        for idx in range(0,len(nums),+2):
            maxSum += min(nums[idx],nums[idx+1])
        
        # return the maxSum
        return maxSum