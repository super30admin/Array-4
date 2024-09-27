## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return 0
        n = len(nums)
        curr = nums[0]
        maxx = nums[0]
        for i in range(1,n):
            curr = max(nums[i],curr+nums[i])
            maxx = max(maxx,curr)
        return maxx
        
#Time Complexity: O(n)
#Space Complexity: O(1)
#Approach: Take two random variables, compare and update them simultaneously. 