#Time Complexity : O(N log N)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : No

from ast import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()  
        total_sum = 0
        for i in range(0, len(nums), 2):
            total_sum += nums[i]
        return total_sum
        