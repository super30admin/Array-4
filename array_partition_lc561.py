"""
Author: Srinidhi
Time Complxity: O(N log N) - Sorting
Space Complexity: O(1) - Constant space for variables
Did it run on LC: yes

Logic: Thinking about this in greedy way, to get the max overall,
we need to sort it, so that when numbers are paired, the max and max-1
dont get comprimised
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        if len(nums)==2:
            return min(nums)
        
        curr_sum = 0
        nums.sort()
        for i in range(0,len(nums)-1,2):
            curr_sum = curr_sum + min(nums[i],nums[i+1])
        return curr_sum