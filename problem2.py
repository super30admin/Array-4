#Time Complexity : O(N)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : No

from ast import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        curr_sum = nums[0]
        max_sum = nums[0]
        
        for i in nums[1:]:
            curr_sum = max(i, curr_sum+i)
            max_sum = max(max_sum, curr_sum)
            
        
        return max_sum
        