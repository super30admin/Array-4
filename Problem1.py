"""
// Time Complexity : o(n log n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
           
        nums = sorted(nums) #sort the numbers, so that the gap between consequetive numbers is min
        res = 0
        
        for i in range(0, len(nums)-1, 2): # add every second number to the result
            res += nums[i]
            
        return res