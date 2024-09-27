# Time Complexity : O(n)[n = length of nums list]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Example
# i   nums[i] local   global
# 0   -2       -2       -2
# 1   1         1        1
# 2   -3       -2        1
# 3   4         4        4
# 4   -1        3        4
# 5   2         5        5
# 6   1         6        6
# 7   -5        1        6
# 8   4         5        6


# Problem approach
# 1. Iterate over each element in the list and update the local sum
# 2. For each element we check have two choice 
# 3.    3.1 It is better alone
#       3.2 It is better when added to prev local sum
#
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:return 0
        local_sum, global_max = nums[0], nums[0]
        
        for i in range(1, len(nums)):
            local_sum+=nums[i]
            if local_sum < nums[i]:
                local_sum = nums[i]
            
            if local_sum > global_max:
                global_max = local_sum
        return global_max