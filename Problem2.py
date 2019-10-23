# Time Complexity : O(N) (Where N is total number)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# First find local max by chosing max beetween current number and current number plus local max.
# Than find global max by just choosing max of gloabl max and local max.
# By doing both of this operation together we don't have to store local max for all indexes.
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        ln = len(nums)
#       Initialize first number as local and global max
        global_max = nums[0]
        local_max = nums[0]
        
#       Iterate from second number till last number.
        for i in range(1, ln):
#           update local max by chosing max beetween current number and current number plus locol max.
            local_max = max(nums[i], local_max + nums[i])
#           update global max by chosing max beetween global max and local max.
            global_max = max(global_max, local_max)
        
        return global_max
