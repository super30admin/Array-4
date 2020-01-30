# Runs on Leetcode
    # Runtime - O(n)
    # space - O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums:
            return
        
        nums.sort()
        
        Sum = 0
        
        for i in range(0,len(nums),2):
            Sum += nums[i]
            
        return Sum
