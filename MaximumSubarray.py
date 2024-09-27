'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Maintain a current sum and overall maximum sum.
        If the sum of current sum and the current number is >= the number:
            (the sequance is increasing)
            Add the current number to the current sum.
        Else:
            (the case when all the previous numbers were -ve and the current number is +ve)
            Set the current number as the current sum.

        Recalculate the overall maximum sum.
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum = float('-inf')
        max_sum = curr_sum

        for num in nums:
            if curr_sum + num >= num:
                curr_sum += num
            else:
                curr_sum = num

            max_sum = max(max_sum, curr_sum)

        return max_sum
