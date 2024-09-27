'''
    Time Complexity:
        O(n*log(n))

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Sort the array.
        Sum every number at odd position (i.e., even index).
'''

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum = 0
        for i in range(0, len(nums), 2):
            sum += nums[i]

        return sum
