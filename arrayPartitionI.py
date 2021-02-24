# Time Complexity : O(nlgn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        totalSum = 0
        nums.sort()
        
        for i in range(0,len(nums),2):
            totalSum += nums[i]
            
        return totalSum