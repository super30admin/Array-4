'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 53. Maximum Subarray


# https://leetcode.com/problems/maximum-subarray/

#-----------------
# Time Complexity: 
#-----------------
# O(N): Maximum N elements traversed
#------------------
# Space Complexity: 
#------------------
# O(1) - Need 2 variables. Constant space

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return 0
        
        rSum = nums[0]
        max_sum = nums[0]
        
        for i in range(1, n):
            rSum = max(rSum + nums[i], nums[i])
            max_sum = max(max_sum, rSum)
        
        return max_sum