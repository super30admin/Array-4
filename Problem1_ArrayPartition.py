'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 561. Array Partition I


# https://leetcode.com/problems/array-partition-i/

#-----------------
# Time Complexity: 
#-----------------
# O(NLogN): Need to sort array 
#------------------
# Space Complexity: 
#------------------
# O(1) - Need temp variable

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        else:
            sum_calc = 0
            nums.sort()
            for i in range(0, len(nums), 2):
                sum_calc += nums[i]
            
            return sum_calc
                
        