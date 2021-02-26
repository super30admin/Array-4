# Time complexity - O(n) 
# Space Complexity: O(1) 
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None
# Approach : 1. running sum is maintained and at every point its check whether adding next number was greater than the number itself 
#            2. Check running sum with max value.


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        max_sum = nums[0]
        curr_sum = nums[0]
        start = 0
        end = 0
        curr_start = 0
        
        for i in range(1, len(nums)):
            if nums[i] > curr_sum + nums[i]:
                curr_sum = nums[i]
                curr_start = i
            else:
                curr_sum = curr_sum + nums[i]
            
            if curr_sum > max_sum:
                max_sum = curr_sum
                start = curr_start
                end = i
        print(start, end)
        return max_sum