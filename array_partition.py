# Time Complexity : O(nlogn) because we are sorting the array
# Space Complexity : O(1) because we are not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
The array is simply sorted and even indices are added to get the max sum with the partitions.
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        max_sum = 0
        for i in range(0, len(nums), 2):
            max_sum += nums[i]
        return max_sum
        