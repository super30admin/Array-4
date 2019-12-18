'''
Accepted on leetcode(53)
time - O(N)
space - O(1)
Aprroach: Iterate over the numbers and follow the steps:
# 1: if the curr number is greater than sum then change the sum to curr number. So, that we are staring to sum from curr number to find the maximum sum.
# 2: For every iteration, take the max of sum and max value. Return the max at the end.
'''


class Solution:
    def maxSubArray(self, nums) -> int:
        sum_num = 0
        max_value = -float('inf')

        for num in nums:
            sum_num += num
            # 1: if the curr number is greater than sum then change the sum to curr number. So, that we are staring to sum from curr number to find the maximum sum.
            if num > sum_num:
                sum_num = num
            # 2: For every iteration, take the max of sum and max value. Return the max at the end.
            max_value = max(max_value, sum_num)
        return max_value